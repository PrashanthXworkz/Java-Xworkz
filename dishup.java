package Drivers;

import Things.dish;

public class dishup {
	public static void main(String args[] ) {
		dish d1=new dish();
		d1.setdishName("palav");
		String name=d1.getdishName();
		System.out.println(name);
		
		d1.settype("spicy type");
		String type=d1.gettype();
		System.out.println(type);
		
		d1.setprice(40);
		int price=d1.getprice();
		System.out.println(price);
		
		d1.setquantity(40);
		int quantity=d1.getquantity();
		System.out.println(quantity);
		
		d1.setplace("shimoga");
		String place=d1.getplace();
		System.out.println(place);
		
	}

}
