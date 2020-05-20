package com.todo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.todo.app.repository")
@EntityScan(basePackages = "com.todo.app.entity")
public class TodoAppApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

}
