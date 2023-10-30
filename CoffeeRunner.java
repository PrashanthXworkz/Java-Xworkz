package Drivers;

import Things.CoffePowder;
import Things.Milk;

public class CoffeeRunner {
	public static void main(String[] args) {
		CoffePowder powder=new CoffePowder();
		powder.setType("bru");
		powder.setQuantity(30);
		powder.setPrice(40);
		System.out.println(powder.getType());
		System.out.println(powder.getQuantity());
		System.out.println(powder.getPrice());
		
		//Milk milk=new Milk();
		//milk.setT1(powder);

		
	}

}
