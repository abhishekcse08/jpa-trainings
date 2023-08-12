package com.magnus.jpatraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpaTrainingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaTrainingsApplication.class, args);
	}

}
