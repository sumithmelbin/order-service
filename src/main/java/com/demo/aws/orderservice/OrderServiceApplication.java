package com.demo.aws.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

	@GetMapping("/msg")
	public String msgDemo() {
		return "Application running on AWSElastic beanstalk through AWS BUILD CODE...";
	}
	@GetMapping("/")
	public String msgDemo1() {
		return "Application UP and running on Elastic beanstalk by CodePipeline";
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
