package com.example.UnitTestDemo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class UnitTestDemoApplicationTests {

	DemoUtils demoUtils;

	@Test
	void testEqualsAndNotEquals() {

		int expected = 6;
		int unexpected = 8;

		int actual = demoUtils.add(2,4);

		assertEquals(expected, actual, "2+4 must be 6");
		assertNotEquals(unexpected, actual, "2+4 must not be 6");
	}

	@Test
	void testNullOrNotNull() {

		String str1 = null;
		String str2 = "test";

		assertNull(demoUtils.checkNullOrNotNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNullOrNotNull(str2), "Object should not be null");
	}

	@BeforeEach
	void beforeEach() {
		demoUtils = new DemoUtils();
		System.out.println("@BeforeEach method hehe");
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before everything starts! I am.");
	}


	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach method hehe");
	}

}
