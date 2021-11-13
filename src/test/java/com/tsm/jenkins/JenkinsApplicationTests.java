package com.tsm.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootTest
class JenkinsApplicationTests {

	Logger log=Logger.getLogger("jenkinsLogger");
	@Test
	void contextLoads() {
		log.log(Level.INFO,":: Executing the test case ::");
		Assertions.assertTrue(true);
	}

}
