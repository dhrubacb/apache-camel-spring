package com.dhruba.apache_camel_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApacheCamelSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelSpringApplication.class, args);

	}

}
