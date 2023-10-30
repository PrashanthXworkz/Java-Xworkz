package Drivers;

import Things.KSRTC;

public class KSRTCbus {
	public static void main(String args[]) {
		KSRTC num=new KSRTC();
		num.setbusName("Rajahamsa");
		String busName=num.getbusName();
		System.out.println(busName);
		
		num.setbusNumber(32);
		int busNumber=num.getbusNumber();
		System.out.println(busNumber);
		
		num.setnumberOfSeats(60);
		int numberOfSeats=num.getnumberOfSeats();
		System.out.println(numberOfSeats);
		
		num.setfrom("shimoga");
		String from=num.getfrom();
		System.out.println(from);
		
		num.setto("banglore");
		String to=num.getto();
		System.out.println(to);
		
	}

}
