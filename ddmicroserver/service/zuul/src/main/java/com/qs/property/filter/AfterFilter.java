package com.qs.property.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
/**
 * 路由后过滤
 * @author qingshan
 *
 */
@Component
public class AfterFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
