package com.tsm.jenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication implements CommandLineRunner {
	Logger log=Logger.getLogger("jenkinsLogger");

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.log(Level.INFO,":: Application started successfully ::");
		log.log(Level.INFO,":: Adding second log to test automatic build in jenkins as soon as code is committed to master ::");
	}
}
