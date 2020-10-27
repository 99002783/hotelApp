package com.lts.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	String name;
	Integer price;
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	@Value("${student.course.name}")
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
