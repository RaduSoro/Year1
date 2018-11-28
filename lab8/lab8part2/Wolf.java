
public class Wolf extends Carnivore{

	
	//constructor
	public Wolf(String name ,int age) {
		super(name, age);
	}
	
	public Wolf() {
		super("newborn",0);
	}
	
	
	
	//make noise method
	public void makeNoise() {
		System.out.println("RAAAAAAAWR");
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
