package com.ClotheAppSpringServer.ClotheAppServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.ClotheAppSpringServer.ClotheAppServer")
@EnableAutoConfiguration
public class ClotheAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClotheAppServerApplication.class, args);
	}



}
