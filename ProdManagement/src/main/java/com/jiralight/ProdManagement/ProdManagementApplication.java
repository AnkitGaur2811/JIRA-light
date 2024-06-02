package com.jiralight.ProdManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jiralight.ProdManagement.Repositories")
public class ProdManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdManagementApplication.class, args);
	}

}
