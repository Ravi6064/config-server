package com.config.springbootconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("This is the in the master");
		SpringApplication.run(SpringBootConfigServerApplication.class, args);
	}

}
