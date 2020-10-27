package com.lts.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	String state;
	String city;
	public String getState() {
		return state;
	}
	@Value("${employee.address.state}")
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}

}
