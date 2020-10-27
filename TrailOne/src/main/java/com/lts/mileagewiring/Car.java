package com.lts.mileagewiring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Mile {

	@Override
	public void showMileage(int x) {
		// TODO Auto-generated method stub
		System.out.println("Car mileage is"+x);

	}

}
