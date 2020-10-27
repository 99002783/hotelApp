package com.training.examples;

public class Calculator {

	public int Sum(int x,int y)
	{
		return x+y;
	}

	public int Sub(int x,int y)
	{
		return x-y;
	}
	
	public int Div(int x,int y)
	{
		return x/y;
	}
	
	public double average(int x,int y,int z)throws NegativeValueException
	{
		if(x<0||y<0||z<0)
		{
			throw new NegativeValueException("negative numbers not allowed");
		}
	        int sum=x+y+z;
	        return sum/3;
	}
	
}
