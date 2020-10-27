package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	String name;
	String dept;
	Integer id;
	
	@Autowired
	Address address;
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	@Value("${employee.id}")
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", id=" + id + ", address=" + address + "]";
	}
	
	

}
