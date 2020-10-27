package com.lts.mileagewiring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Mile {

	@Override
	public void showMileage(int x) {
		// TODO Auto-generated method stub
		System.out.println("Bike mileage is"+x);

	}

}
