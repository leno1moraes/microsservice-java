package com.srv_service_discovery.srv_service_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SrvServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrvServiceDiscoveryApplication.class, args);
	}

}
