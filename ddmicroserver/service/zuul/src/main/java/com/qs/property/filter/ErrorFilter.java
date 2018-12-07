package com.qs.property.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
/**
 * 错误处理方式
 * @author qingshan
 *
 */
@Component
public class ErrorFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "error";
	}

}
