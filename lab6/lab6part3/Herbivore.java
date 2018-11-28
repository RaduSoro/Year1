
public abstract class Herbivore extends Animal {

	public Herbivore(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}

	// throws an exception if the food eaten is meat
	public void eat(Food food) throws Exception {
		if(food instanceof Plant )
		System.out.println( super.getName() +  " is eating " + food.getName());
		else
			throw new Exception(super.getName() + " can not eat " +food.getName() );
	}
}
