package Things;

public class coffee {
	public String branchName;
	public String flavours;
	public int price;
	public String place;
	public String quantity;
	
	public void coffee() {
		System.out.println("default constructor invoked");
	}
	
	public void coffee(String branchName,String flavours,int price,String place,String quantity) {
		this.branchName=branchName;
		this.flavours=flavours;
		this.price=price;
		this.place=place;
		this.quantity=quantity;
	}
	
	public void setbranchName(String branchName) {
		this.branchName=branchName;
		
	}
	public String getbranchName() {
		return branchName;
	}
	
	public void setflavours(String flavours) {
		this.flavours=flavours;
		
	}
	public String getflavours() {
		return flavours;
	}
	
	public void setprice(int price) {
		this.price=price;
		
	}
	public int getprice() {
		return price;
	}
	
	public void setplace(String place) {
		this.place=place;
		
	}
	public String getplace() {
		return place;
	}
	
	public void setquantity(String quantity) {
		this.quantity=quantity;
		
	}
	public String getquantity() {
		return quantity;
	}
	

}
