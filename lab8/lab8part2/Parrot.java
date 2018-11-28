
public class Parrot extends Omnivore{

	//constructor
	public Parrot(String name, int age ) {
		super(name,age);
	}
	
	//constructor
		public Parrot( Integer age ) {
			this("Polly", age);
		}
	
	
	//make noise method
	public void makeNoise() {
		System.out.println("PIRATE");
	}
	


	public void eat(Food food) {
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
