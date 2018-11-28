
public abstract class Animal {
	
	private String name;
	private int age;
	//constructor
	public Animal(String givenName, int givenAge) {
		this.name=givenName;
		this.age=givenAge;
	}
	
	//age getter
	public int getAge() {
		return this.age;
	}
	
	//name getter
	public String getName() {
		return this.name;
	}
	
	public abstract void makeNoise();
}
