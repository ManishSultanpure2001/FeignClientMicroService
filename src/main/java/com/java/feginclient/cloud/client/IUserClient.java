package com.java.feginclient.cloud.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.feignclient.cloud.dto.UserResponce;

@FeignClient(name = "User-Client",url = "https://jsonplaceholder.typicode.com")
public interface IUserClient {

	@GetMapping("/users")
	public List<UserResponce> getAllUsers();
}
