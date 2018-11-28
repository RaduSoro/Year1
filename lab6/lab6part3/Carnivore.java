
public abstract class Carnivore extends Animal {

	public Carnivore(String givenName, int givenAge) {
		super(givenName, givenAge);
	
	}

		// throws an exception if the food eaten is plant
	public void eat(Food food) throws Exception {
		if(food instanceof Meat)
		System.out.println(super.getName() +  " is eating " + food.getName());
		else
			throw new Exception(super.getName() + " can not eat " +food.getName() );
	}
}
