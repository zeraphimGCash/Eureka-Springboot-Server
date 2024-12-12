package com.example.Server_JCDiamante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerJcDiamanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerJcDiamanteApplication.class, args);
	}

}
