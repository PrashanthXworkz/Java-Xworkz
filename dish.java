package Things;

public class dish {
	private String dishName;
	private String type;
	private int price;
	private int quantity;
	private String place;
	
	public void setdishName(String dishName) {
		this.dishName=dishName;
	}
	public String getdishName() {
		return dishName;
	}
	
	
	public void settype(String type) {
		this.type=type;
	}
	public String gettype() {
		return type;
	}
	
	public void setprice(int price) {
		this.price=price;
		}
	public int getprice(){
		return price;
		}
	
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public int getquantity() {
		return quantity;
	}
	
	public void setplace(String place) {
		this.place=place;
	}
    public String getplace() {
    	return place;
    }
}
