package Things;

public class KSRTC {
	public String busName;
	public int busNumber;
	public int numberOfSeats;
	public String to;
	public String from;
	
	public void KSRTC(){
		System.out.println("default constructor invoked");		
	}
	
	public void KSRTC(String busName,int busNumber,int numberOfSeats,String to,String from){
		this.busName=busName;
		this.busNumber=busNumber;
		this.numberOfSeats=numberOfSeats;
		this.to=to;
		this.from=from;
		}
	
	public void setbusName(String busName) {
		this.busName=busName;
	}
	public String getbusName(){
		return busName;
	}
	
	public void setbusNumber(int busNumber) {
		this.busNumber=busNumber;
	}
	public int getbusNumber(){
		return busNumber;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats=numberOfSeats;
	}
	public int getnumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setto(String to) {
		this.to=to;
	}
    public String getto() {
    	return to;
    }
    
    public void setfrom(String from) {
    	this.from=from;
    }
    public String getfrom() {
    	return from;
    }
}
