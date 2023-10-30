package Things;

public class CoffePowder {  
	private String type;
	private int price;
	private int quantity;
	
	public CoffePowder() {
		System.out.println("No arguments invoked");
	}
	public void CoffePowder(String type,int price,int quantity) {
		this.type=type;
		this.price=price;
		this.quantity=quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
