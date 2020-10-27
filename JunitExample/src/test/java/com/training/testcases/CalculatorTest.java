package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.examples.Calculator;
import com.training.examples.DepositExceedingException;
import com.training.examples.NegativeValueException;

class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Befor all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all Testcases ");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		System.out.println("before each Testcase ");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		
		System.out.println("After each Testcase ");
	}

	@Test
	void testSum() {
		int actual=calculator.Sum(10, 20);
		assertEquals(30,actual);
	}
	
	void test1Sum() {
		int actual=calculator.Sum(10, 20);
		assertEquals(10,actual);
	}
	
	@Test
	void testSub() {
		int actual=calculator.Sub(20, 10);
		assertEquals(10,actual);
	}
	
	@Test
	void testDiv() {
		int actual=calculator.Div(20, 10);
		assertEquals(2,actual);
	}
	@Test
	void testAverage() {
		double actual=calculator.average(1,2,3);
		assertEquals(2,actual);
	}
	@Test
	void testAverageNegative() throws NegativeValueException {
		assertThrows(NegativeValueException.class,()->calculator.average(-1, -2, -3));
		
	}
	
	
	

}
