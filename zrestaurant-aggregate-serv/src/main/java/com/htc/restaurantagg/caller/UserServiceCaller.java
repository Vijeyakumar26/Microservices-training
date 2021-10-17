package com.htc.restaurantagg.caller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.htc.restaurantagg.model.Users;

@FeignClient("restaurant-user-service")
@Component
public interface UserServiceCaller {
	
	@GetMapping("/user/search/findByUserId")
	CollectionModel<Users> findByUserId(@RequestParam("userId") Long userId);
	
}
