package com.learn.JenkinsDemo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyUtilTest {

	public static Logger logger = LoggerFactory.getLogger(MyUtilTest.class);

	@Test
	void testIsPrime() {
		assertTrue(MyUtil.isPrime(13));
		assertFalse(MyUtil.isPrime(15));
		assertFalse(MyUtil.isPrime(10));
		assertTrue(MyUtil.isPrime(23));
	}

}
