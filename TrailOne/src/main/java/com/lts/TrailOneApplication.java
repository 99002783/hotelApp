package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.constructor.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.jbased.Vehicle;
import com.lts.mileagewiring.VehicleDetails;
import com.lts.setter.Employee;

@SpringBootApplication
public class TrailOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Vehicle vehicle= context.getBean("vehicle",Vehicle.class);
		//System.out.println(vehicle);
		
		
		/*Employee employee1=context.getBean("employee",Employee.class);
		System.out.println(employee1);
		
		Employee employee2=context.getBean("employee",Employee.class);
		System.out.println(employee2);
		employee2.setName("charitha");
		System.out.println("emp1"+employee1);
		System.out.println("emp2"+employee2);*/
		
		
		
		
	  //Student student=context.getBean("student",Student.class);
	  //System.out.println(student);
		
		ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
		shapeFactory.printArea(3, 5);
		
		/*FoodPanda foodPanda=context.getBean(FoodPanda.class);
		foodPanda.showMenu("indian");
		foodPanda.showMenu("chinese");*/
		
		/*VehicleDetails vehicleDetails=context.getBean(VehicleDetails.class);
		vehicleDetails.getMileage("car");
		vehicleDetails.getMileage("bike");*/
		
	  
	  
	  
		
		
	}

}
