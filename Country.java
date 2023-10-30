package Things;

public class Country {
	
	private State state;
	
	public Country() {
		System.out.println("No arguements invoked");
	}
	
	public Country(State state) {
		this.state=state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
