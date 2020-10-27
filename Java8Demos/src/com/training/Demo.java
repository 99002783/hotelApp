package com.training;

import java.util.function.Consumer;

interface calculator
{
	void calculate(int x,int y);
}

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		calculator calc1=(int x,int y)->System.out.println(x*y);
		calc1.calculate(10,20);
		
		Consumer<String> con=(s)->System.out.println(s.toUpperCase());
		con.accept("Hello");
		Consumer<Integer> on=(t)->System.out.println(t*t);
		on.accept(10);
		

	}

}
