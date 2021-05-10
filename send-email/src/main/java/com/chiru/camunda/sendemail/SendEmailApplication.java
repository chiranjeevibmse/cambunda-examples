package com.chiru.camunda.sendemail;

import org.camunda.bpm.application.ProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ProcessApplication
public class SendEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}

}
