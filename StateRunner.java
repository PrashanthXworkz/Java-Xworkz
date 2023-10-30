package Drivers;

import Things.Country;
import Things.State;

public class StateRunner {
	public static void main(String[] args) {
		State d1=new State();
		d1.setName("Karnataka");
		d1.setPincode(577201);
		d1.setLocation("Shimoga");
		
		Country c =new Country(d1);
		System.out.println(c.getState().getName());
		System.out.println(c.getState().getPincode());
		System.out.println(c.getState().getLocation());
	}

}
