package Drivers;

import Things.coffee;

public class coffeeShop {
	public static void main(String args[]) {
		coffee shop=new coffee();
		
      shop.setbranchName("goodday");
      String branch=shop.getbranchName();
      System.out.println(branch);
      
      shop.setflavours("strong");
      String flavour=shop.getflavours();
      System.out.println(flavour);
      
      shop.setprice(30);
      int amount=shop.getprice();
      System.out.println(amount);
      
      shop.setplace("gadag");
      String place=shop.getplace();
      System.out.println(place);
      
      shop.setquantity("full");
      String quan=shop.getquantity();
      System.out.println(quan);
     
	}

}
