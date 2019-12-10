package com.seenu.springcloudcofigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudCofigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCofigServerApplication.class, args);
	}
}
