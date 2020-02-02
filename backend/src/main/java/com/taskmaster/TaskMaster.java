package com.taskmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The entrypoint for the Task Master Spring Boot application.
 * 
 * @author CPerry26
 *
 */
@SpringBootApplication
public class TaskMaster
{

	public static void main(String[] args)
	{
		SpringApplication.run(TaskMaster.class, args);
	}
}