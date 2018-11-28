
public class Zebra extends Herbivore {

	public Zebra(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}

	public void makeNoise() {
		System.out.println("Nihahaha?");
	}
	
	public void eat(Food food) throws Exception {
		super.eat(food);
	}
	
	
	
}
