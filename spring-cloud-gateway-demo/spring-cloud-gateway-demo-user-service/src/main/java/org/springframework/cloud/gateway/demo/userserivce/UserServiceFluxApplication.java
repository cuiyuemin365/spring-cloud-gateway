package org.springframework.cloud.gateway.demo.userserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceFluxApplication.class, args);
	}

}
