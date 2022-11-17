package com.java.feginclient.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringInterceptor1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringInterceptor1Application.class, args);
	}

}
