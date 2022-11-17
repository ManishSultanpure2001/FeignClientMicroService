package com.java.feginclient.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.feginclient.cloud.client.IUserClient;
import com.java.feignclient.cloud.dto.UserResponce;

@RestController
@RequestMapping("/api/v1")
public class UserController{

	@Autowired
	private IUserClient client;

 	@GetMapping("/users")
 	public List<UserResponce> getAllUsers() {
 		return client.getAllUsers();
 	}
}