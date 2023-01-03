package com.mycompany.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ToyProject01BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyProject01BackApplication.class, args);
	}

}
