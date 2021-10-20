package com.htc.eureka_server.components;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/*
 * Base abstract class for ZuulFilters. 
 * The base class defines abstract methods to define:filterType() - to classify a filter by type.
 *  Standard types in Zuul are "pre" for pre-routing filtering,
 *  							"route" for routing to an origin, 
 *  							"post" for post-routing filters,
 *  							"error" for error handling.
 *  We also support a "static" type for static responses see StaticResponseFilter.Any filterType made be created or added and run by calling FilterProcessor.runFilters(type) 

filterOrder() must also be defined for a filter. 
Filters may have the same filterOrder if precedence is notimportant for a filter.
 filterOrders do not need to be sequential. 

ZuulFilters may be disabled using Archius Properties. 

 */


@Component
public class LoggingFilter extends ZuulFilter{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
//Filter Logic will be defined below method
	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();	
		logger.info("request ={} request uri={}",request,request.getRequestURI());
		logger.info("Remote Host request={}",request.getRemoteHost());
	
		return null;
	}
	/*
	 * Defining When we need to Execute Filter
	 */

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
