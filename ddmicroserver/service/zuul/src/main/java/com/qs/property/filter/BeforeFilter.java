package com.qs.property.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.qs.property.util.PtLog;

/**
 * 路由开始之前过滤
 * @author qingshan
 *
 */
@Component
public class BeforeFilter extends ZuulFilter {

	private static PtLog log = PtLog.getLogger(BeforeFilter.class);
	
	/**
	 * 主要的处理逻辑的方法，做权限控制、日志等都是在这里。
	 */
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
	}
	/**
	 * 可以直接设置为true或者false
	 * true代表生效，false代表不生效。
	 * 设置为false作用，有时会动态的决定让不让一个filter生效，例如可能根据Request里是否携带某个参数来判断是否需要生效，
	 * 或者需要从上一个filter里接收某个数据来决定，再希望能手工控制是否生效（使用如Appolo之类的配置中心，来动态设置该字段）。
	 */
	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object api = request.getParameter("api");
        if(api == null) {
            log.warn("api is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("api is empty");
            }catch (Exception e){}
            return true;
        }
		return false;
	}
	/**
	 * filterOrder代表过滤器顺序
	 */
	@Override
	public int filterOrder() {
		return 0;
	}
	/**
	 * filterType代表过滤类型
	 * PRE: 该类型的filters在Request routing到源web-service之前执行。用来实现Authentication、选择源服务地址等
	 * ROUTING：该类型的filters用于把Request routing到源web-service，源web-service是实现业务逻辑的服务。这里使用HttpClient请求web-service
	 * POST：该类型的filters在ROUTING返回Response后执行。用来实现对Response结果进行修改，收集统计数据以及把Response传输会客户端
	 * ERROR：上面三个过程中任何一个出现错误都交由ERROR类型的filters进行处理
	 * 主要关注 pre、post和error。分别代表前置过滤，后置过滤和异常过滤。
	 * 如果filter是pre的，就是指请求先进入pre的filter类，可以进行一些权限认证，日志记录，或者额外给Request增加一些属性供后续的filter使用。
	 * pre会优先按照order从小到大执行，然后再去执行请求转发到业务服务。
	 * 如果filter是post，如果type为post，就会执行完被路由的业务服务后，再进入post的filter，在post的filter里，一般做一些日志记录，或者额外增加response属性什么的。
	 * 最后error，如果在上面的任何一个地方出现了异常，就会进入到type为error的filter中。
	 * 
	 * pre:路由前
	 * routing：路由时
	 * post： 路由后
	 * error：发送错误调用
	 */
	public String filterType() {
		return "pre";
	}

}
