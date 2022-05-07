package com.ludis.caloriesservice;

import com.ludis.caloriesservice.repository.CaloriesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableEurekaClient
@EnableMongoRepositories
@SpringBootApplication
public class CaloriesServiceApplication {

	@Autowired
	CaloriesRepository caloriesRepository;


	private final static String QUEUE_NAME = "calories";

	static Logger logger
			= LoggerFactory.getLogger(CaloriesServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CaloriesServiceApplication.class, args);
	}

}
