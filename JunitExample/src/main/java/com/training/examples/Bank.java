package com.training.examples;

public class Bank {
	double balance;
	
	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws ExceedingException
	{
		
		if(amount>=4000||amount==balance)
		{
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0)
		{
			throw new NegativeValueException("negative amount");
		}
		balance=balance-amount;
		return balance;
	}

	public double deposit(double amount) throws DepositExceedingException
	{
		if(amount>=20000)
			
		{
			throw new DepositExceedingException("exceeding daily limit");
		}
		balance=balance+amount;
		return balance;
		
	}
	
	

}
