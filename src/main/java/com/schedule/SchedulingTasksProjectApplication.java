package com.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingTasksProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksProjectApplication.class, args);
	}

}
