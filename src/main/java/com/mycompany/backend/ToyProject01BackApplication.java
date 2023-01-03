package com.mycompany.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Log4j2
public class ToyProject01BackApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToyProject01BackApplication.class, args);
		log.info("run");
	}
}
