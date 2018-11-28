
public class Zebra extends Herbivore {

	//consturctor
	public Zebra(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}
	
	//noise method
	public void makeNoise() {
		System.out.println("Nihahaha?");
	}
	
	public void eat(Food food) throws Exception {
		super.eat(food);
	}
	public void eat(Food food, Integer number) throws Exception {
		int i=0;
		while(i<number) {
			super.eat(food);
			i++;
		}
		
	}
	
	
}
