package Things;

public class Milk {
	
	private CoffePowder t1;
	
	public Milk() {
		System.out.println("No arguments invoked");
	}
	public Milk(CoffePowder t1) {
		this.t1=t1;
	}
	public CoffePowder getT1() {
		return t1;
	}
	public void setT1(CoffePowder t1) {
		this.t1 = t1;
	}
	
	
	

}
