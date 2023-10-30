package Things;

public class State {
	
	private String name;
	private int pincode;
	private String location;
	
	public State() {
		System.out.println("No arguements invoked");
	}
	public State(String name,int pincode,String location) {
		this.name=name;
		this.pincode=pincode;
		this.location=location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
