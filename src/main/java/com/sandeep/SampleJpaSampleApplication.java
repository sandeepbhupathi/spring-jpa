package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.sandeep.*"})
public class SampleJpaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJpaSampleApplication.class, args);
	}
}
