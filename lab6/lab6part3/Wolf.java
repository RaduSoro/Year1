
public class Wolf extends Carnivore{

	
	//constructor
	public Wolf(String name ,int age) {
		super(name, age);
	}
	
	
	//make noise method
	public void makeNoise() {
		System.out.println("RAAAAAAAWR");
	}
	
	public void eat(Food food) throws Exception {
		super.eat(food);
	}
	
	
}
