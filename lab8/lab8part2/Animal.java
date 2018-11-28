
public abstract class Animal implements Comparable<Animal>{
	
	private String name;
	private Integer age;
	//constructor
	public Animal(String givenName, int givenAge) {
		this.name=givenName;
		this.age=givenAge;
	}
	//calls the other constructor with the arguments newborn and 0
	
	
	//age getter
	public int getAge() {
		return this.age;
	}
	
	//name getter
	public String getName() {
		return this.name;
	}
	
	public int compareTo(Animal a1) {
		return age - a1.getAge();
		}
	
	
	//makes an abstract class wihch makes it mandatory for any subclass
	public abstract void makeNoise();
	public abstract void eat(Food food) throws Exception;
	public abstract void eat(Food food, Integer number) throws Exception;
}
