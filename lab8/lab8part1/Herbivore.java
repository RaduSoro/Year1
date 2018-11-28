
public abstract class Herbivore extends Animal {

	public Herbivore(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}
	public void eat(Food food) throws Exception {
		//tests if this instance of food is from the Meat class otherwise it creates a new exception and it throws it
		if(food instanceof Plant )
		System.out.println( super.getName() +  " is eating " + food.getName());
		else
			throw new Exception(super.getName() + " can not eat " +food.getName() );
	}
}
