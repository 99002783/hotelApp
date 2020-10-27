package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda {
	@Autowired
	@Qualifier("chinese")
	Menu cmenu;
	
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	public void showMenu(String choice)
	{
		if(choice.equals("chinese"))
		{
			System.out.println(cmenu.itemsAvailable());   
		}
		else
		{
			System.out.println(imenu.itemsAvailable());
		}
		
	}
        
			
	}


