
public class Parrot extends Omnivore {

	//constructor
	public Parrot(String name, int age ) {
		super(name,age);
	}
	
	
	//make noise method
	public void makeNoise() {
		System.out.println("PIRATE");
	}
	


	public void eat(Food food) {
	super.eat(food);
	}

}
