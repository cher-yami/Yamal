package com.ccstudent.ccconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CcConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcConfigServiceApplication.class, args);
	}

}
