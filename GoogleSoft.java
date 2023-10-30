package Drivers;

import Things.Google;

public class GoogleSoft {
	
	 public static void main(String[] args) {
	        Google google = new Google();

	        google.SetName("abhi");
			String name=google.getName();
			System.out.println(name);
			google.Setemployees(12);
			int a1=google.getemployees();
			System.out.println(a1);
			google.SetRevenue(96.00);
			double b1=google.getRevenue();
			System.out.println(b1);
			google.SetIspublic(true);
			boolean c1=google.getIspublic();
			System.out.println(c1);
			google.SetHeadQuarters("Delhi");
			String d1=google.getHeadQuarters();
			System.out.println(d1);
			google.SetLocation("Banglore");
			String e1=google.getLocation();
			System.out.println(e1);
			google.SetId(6);
			int f1=google.getId();
			System.out.println(f1);
			google.SetUserId("a23");
			String g1=google.getUserId();
			System.out.println(g1);
			google.SetSalary(960);
			double h1=google.getSalary();
			System.out.println(h1);
			google.SetProduct("gar");
			String i1=google.getProduct();
			System.out.println(i1);
			}
}
