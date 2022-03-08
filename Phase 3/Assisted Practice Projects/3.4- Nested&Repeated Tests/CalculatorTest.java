package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.demo.Calculator;
import com.demo.MathTools;

public class CalculatorTest {
	
	Calculator cal;
	@BeforeAll
	public static void beforeAll() {
		System.out.println("--------Before All---------");
	}
	@BeforeEach
	public void before() {
		System.out.println("--------Before Each---------");
		cal = new Calculator();
	}
	@Test
	@DisplayName("Test add for positive values")
	public void testAddShouldReturnShouldPositiveValue() {
		System.out.println("--------TEST POSITIVE ---------");
		int expected = 10;
		int actual = cal.add(5,5);
		assertEquals(expected, actual);
	}
	@Test
	@Disabled //it will disable the test case
	public void testAddShouldReturnShouldNegativeValue() {
		System.out.println("--------TEST NEGATIVE ---------");
		int expected = -10;
		int actual = cal.add(-5,-5);
		assertEquals(expected, actual);
	}
	@Test
	public void testShouldTimeOut() {
		assertTimeout(Duration.ofSeconds(2), MathTools.convertToDecimal(10, 3));
	}
	@AfterEach
	public void after() {
		System.out.println("--------After Each---------");
		cal = null;
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("--------After All---------");
	}


}
