
public abstract class Carnivore extends Animal {

	public Carnivore(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}
	
	public Carnivore() {
		super("newborn",0);
	}
	
	public void eat(Food food) throws Exception {
		//tests if this instance of food is from the Meat class otherwise it creates a new exception and it throws it
		if(food instanceof Meat)
		System.out.println(super.getName() +  " is eating " + food.getName());
		else
			throw new Exception(super.getName() + " can not eat " +food.getName() );
	}
}
