package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.examples.Bank;
import com.training.examples.DepositExceedingException;
import com.training.examples.ExceedingException;
import com.training.examples.NegativeValueException;

class BankTest {
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bank=new Bank(8000);
		System.out.println("Before test");
	}

	@AfterEach
	void tearDown() throws Exception {
		bank=null;
		System.out.println("After Test");
	}

	@Test
	void testWithdraw() throws ExceedingException {
		double balance=bank.withdraw(2000);
		assertEquals(6000,balance,"should be 6000");
		
		
	}
	
	@Test
	void testWithdrawExceeding() throws ExceedingException {
		
		assertThrows(ExceedingException.class,()->bank.withdraw(4100));
		
		
	}
	
	@Test
	void testWithdrawNegative() throws NegativeValueException {
		//double balance=bank.withdraw(4100);
		assertThrows(NegativeValueException.class,()->bank.withdraw(-900));
   	}
	
	@Test
	void testDeposit() throws DepositExceedingException {
		double deposit=bank.deposit(2000);
		assertEquals(10000,deposit,"should be 10000");
		
	}
	
 @Test
 @DisplayName("Test deposit")
 void testDepositExceeding() throws DepositExceedingException {
	 assertThrows(DepositExceedingException.class,()->bank.deposit(20000));
	
		
	}
 
	
	
	
	
	
	

}
