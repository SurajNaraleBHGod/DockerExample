package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DockerExampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder createSpringApplicationBuilder() {
		return createSpringApplicationBuilder().sources(DockerExampleApplication.class);
	}
}
