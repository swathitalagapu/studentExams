package com.example.studentExams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class StudentExamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentExamsApplication.class, args);
	}

}
