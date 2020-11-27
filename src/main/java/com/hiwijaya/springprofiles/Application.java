package com.hiwijaya.springprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})	// ignore auto config, for demo only.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
