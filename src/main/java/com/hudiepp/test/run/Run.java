package com.hudiepp.test.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Run {

	@RequestMapping("/home")
	public Object home() {
		System.out.println("1111111111111");
		return "OK11";
	}

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}