package com.htc.productagg.service.util;

/*
 * For Normal RestTemplate we can use to get URL of target Service by using <EurekaClient Object>.getNextServerFromEureka()
 * if youre using feign client just provide the server name feign will able to get next server
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
@Component
public class ServiceClients {
//	@Autowired
//	private static EurekaClient discoveryClient;//Entire application scope it can be static
//	
//	static ServiceClients clients=new ServiceClients();
//	public static final String productServiceURL=clients.getProductServiceURL();
//	
//	public  String getProductServiceURL()
//	{
//		InstanceInfo instance=discoveryClient.getNextServerFromEureka("product-service", false);
//		return instance.getHomePageUrl();
//	}
//	public  String getReviewServiceURL()
//	{
//		InstanceInfo instance=discoveryClient.getNextServerFromEureka("product-review-service", false);
//		return instance.getHomePageUrl();
//	}
//	
//	public  String getRecommendationServiceURL()
//	{
//		InstanceInfo instance=discoveryClient.getNextServerFromEureka("product-recommendation-service", false);
//		return instance.getHomePageUrl();
//	}
//
//

}
