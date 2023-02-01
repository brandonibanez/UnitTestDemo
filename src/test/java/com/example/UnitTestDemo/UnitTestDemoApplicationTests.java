package com.example.UnitTestDemo;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UnitTestDemoApplicationTests {

	DemoUtils demoUtils;

	@Test
	@DisplayName("Equals and not Equals")
	void testEqualsAndNotEquals() {

		int expected = 6;
		int unexpected = 8;

		int actual = demoUtils.add(2,4);

		assertEquals(expected, actual, "2+4 must be 6");
		assertNotEquals(unexpected, actual, "2+4 must not be 6");
	}

	@Test
	@DisplayName("Null or Not Null")
	void testNullOrNotNull() {

		String str1 = null;
		String str2 = "test";

		assertNull(demoUtils.checkNullOrNotNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNullOrNotNull(str2), "Object should not be null");
	}

	@Test
	@DisplayName("Same and Not Same")
	void testSameAndNotSame() {

		String str = "luv2code";

		assertSame(demoUtils.getName(), demoUtils.getNameDuplicate(),
				"Objects should refer to the same object");
		assertNotSame(str, demoUtils.getName(),
				"Objects should not refer to same object");

	}

	@Test
	@DisplayName("True and False")
	void testTrueFalse() {

		int num1 = 10;
		int num2 = 5;

		assertTrue(demoUtils.checkIfN1GreaterThanN2(num1,num2),
				"This should return true");
		assertFalse(demoUtils.checkIfN1GreaterThanN2(num2,num1),
				"This should return false");

	}

	@Test
	@DisplayName("Array Equals")
	void testArrayEquals() {

		String[] stringArray = {"A", "B", "C"};

		assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),
				"Arrays should be the same");

	}

	@Test
	@DisplayName("Iterable Equals")
	void testIterableEquals() {

		List<String> theList = List.of("My", "name", "is", "Bob");

		assertIterableEquals(theList, demoUtils.getNameInList(),
				"Expected list should be same as actual list");

	}

	@Test
	@DisplayName("Lines match")
	void testLinesMatch() {

		List<String> theList = List.of("My", "name", "is", "Bob");

		assertLinesMatch(theList, demoUtils.getNameInList(),
				"Lines should match");

	}

	@BeforeEach
	void beforeEach() {
		demoUtils = new DemoUtils();
	}

//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("Before everything starts! I am.");
//	}


//	@AfterEach
//	void afterEach() {
//		System.out.println("@AfterEach method hehe");
//	}

}
