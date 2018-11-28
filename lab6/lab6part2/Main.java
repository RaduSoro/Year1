
public class Main {
	public static void main(String args[]){
		System.out.println("Creating a new wolf with the name Ben and age 10");
		Wolf wolf= new Wolf("Ben", 10);
		System.out.println("The wolf " + wolf.getName() + " has " + wolf.getAge() + " years");
		System.out.println(wolf.getName() + " is making a noise: ");
		wolf.makeNoise();

		
		System.out.println("Creating a new parrot with the name Glen and age 2");
		Parrot parrot= new Parrot("Glen" , 2);
		System.out.println("The parrot " + parrot.getName() + " has " + parrot.getAge() + " years");
		System.out.println(parrot.getName() + " is making a noise: ");
		parrot.makeNoise();
		
		Meat beef= new Meat("Beef");
		Plant cactus = new Plant("Cactus");
	}
}
