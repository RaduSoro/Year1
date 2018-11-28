
public abstract class Omnivore extends Animal{

	public Omnivore(String givenName, int givenAge) {
		super(givenName, givenAge);
		
	}
	public void eat(Food food) {
		System.out.println(super.getName() +  " is eating " + food.getName());
	}

}
