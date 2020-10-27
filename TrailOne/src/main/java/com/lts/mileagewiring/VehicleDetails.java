package com.lts.mileagewiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	
	@Autowired
	@Qualifier("car")
	Mile car;
	@Autowired
	@Qualifier("bike")
	Mile bike;
	public void getMileage(String choice) {
		if(choice.equals("car"))
			car.showMileage(20);
		else
			bike.showMileage(60);
	}
}
