package com.example.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = FizzBuzz.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @Autowired
    FizzBuzz fizzBuzz;

    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree() {
        String expected = "Fizz";

        assertEquals(expected, fizzBuzz.compute(3), "Should return Fizz");
    }

    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";

        assertEquals(expected, fizzBuzz.compute(5), "Should return Buzz");
    }

    @DisplayName("Divisible by Three & Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, fizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @DisplayName("Not Divisible by Three & Five")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeAndFive() {
        assertEquals(Integer.class, Integer.valueOf(fizzBuzz.compute(2)).getClass(), "Should return a valid digit");
    }

    @DisplayName("Testing with csv data")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvSource({
            "1,1",
            "2,2",
            "3,Fizz",
            "4,4",
            "5,Buzz",
            "6,Fizz",
            "7,7",
    })
    @Order(5)
    void testCsvData(int value, String expected) {
        assertEquals(expected, fizzBuzz.compute(value));
    }

    @DisplayName("Testing with csv file data")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources="/test.csv")
    @Order(6)
    void testCsvFileData(int value, String expected) {
        assertEquals(expected, fizzBuzz.compute(value));
    }
}
