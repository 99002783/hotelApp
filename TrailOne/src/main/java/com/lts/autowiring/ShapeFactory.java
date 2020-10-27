package com.lts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("getRectangle")
	Shape shape;
	
	@Autowired
   @Qualifier("getTraingle")
	Shape mshape;
	
	public void printArea(int x,int y) {
		shape.calculateArea(x, y);
		mshape.calculateArea(x, y);


}
}
