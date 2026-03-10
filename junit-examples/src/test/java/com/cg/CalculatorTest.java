package com.cg;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class CalculatorTest {
	static Calculator cal;
//	@BeforeEach  // using @BeforeEach means it will be executed before every test case
//	public void init() {
//		cal = new Calculator();
//		System.out.println("Calculator object created");
//	}
	
	@BeforeAll  // using @BeforeAll means it will be executed before all test case
	public static void init() {
		cal = new Calculator();
		System.out.println("Calculator object created");
	}
	
	@AfterAll  // using @AfterAll means it will be executed after all test case
	public static void destroy() {
		cal = new Calculator();
		System.out.println("Calculator object created");
	}
	
//	@AfterEach  // using @AfterEach means it will be executed after every test case
//	public void destroy() {
//		cal = new Calculator();
//		System.out.println("Calculator object destroyed");
//	}
	
	
    @Test
    @CsvSource({"2,4,6" , "6,5,11", "10,15,25"})
    public void calTest() {
        // Test addition
		System.out.println("Testing calculate method");
    	assertEquals(10, cal.calculate(7, 3));
    }
    
//    @Test
    @Timeout(value=10000000, unit = TimeUnit.MILLISECONDS)
//    @Timeout(value=1, unit = TimeUnit.NANOSECONDS)
    @ParameterizedTest
    @ValueSource(ints = {13,17,5,3,23})
    public void primeTest(int n) {
		System.out.println("Testing isPrime method");
    	assertTrue(cal.isPrime(n));
//    	assertFalse(cal.isPrime(0));
//    	assertFalse(cal.isPrime(1));
    	
    }
}