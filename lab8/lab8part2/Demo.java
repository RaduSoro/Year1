import java.util.*;

public class Demo {
	public static void main(String args[]) throws Exception{
		
		//creates 2 new objects beef and cactus for the meat class respectively plant
		Meat beef= new Meat("Beef");
		Plant cactus = new Plant("Cactus");
		
		ArrayList<Animal> listOfAnimals = new ArrayList<Animal>();
		
		
		//creates a new wolf with and makes it do a noise
		Wolf wolf= new Wolf("Ben", 10);
		listOfAnimals.add(wolf);
		System.out.println("The wolf " + wolf.getName() + " has " + wolf.getAge() + " years");
		System.out.println(wolf.getName() + " is making a noise: ");
		wolf.makeNoise();
		System.out.println();
		Wolf wolf2 = new Wolf();
		listOfAnimals.add(wolf2);
		System.out.println("The wolf " + wolf2.getName() + " has " + wolf2.getAge() + " years");
		System.out.println();
		
		//creates a new parrot and it makes it do a noise
		Parrot parrot= new Parrot(2);
		listOfAnimals.add(parrot);
		parrot = new Parrot(3);
		listOfAnimals.add(parrot);
		System.out.println("The parrot " + parrot.getName() + " has " + parrot.getAge() + " years");
		System.out.println(parrot.getName() + " is making a noise: ");
		parrot.makeNoise();
		System.out.println();
		
		
		//creates a new Zebra and makes a noise
		Zebra zebra = new Zebra("Miky", 5);
		listOfAnimals.add(zebra);
		zebra = new Zebra("Nini", 4);
		listOfAnimals.add(zebra);
		System.out.println("The zebra " + zebra.getName() + " has " + zebra.getAge() + " years");
		System.out.println(zebra.getName() + " is making a noise: ");
		zebra.makeNoise();
		
		System.out.println();

	
		
		/* an interface is just like an abstract class but can only have abstract methods and
		 * a class can have multiple interfaces implemented unlike the extends where a class
		 * can inherit only 1 class
		 */
		
		System.out.println();
		
		//tries different functions calling different animals to eat meat/plant in order to detect exceptions
		try {
			zebra.eat(cactus);
			//throws exception when the zebra is eating the wrong kind of food
			wolf.eat(beef,5);
			parrot.eat(beef);
			//cathes the exception and it prints it
		} catch (Exception error) { 
			System.err.println(error.getMessage());
		}
		
		for(Animal ana :listOfAnimals) {
			System.out.println(ana.getName() + " " + ana.getAge());
		}
		Collections.sort(listOfAnimals);
		System.out.println();
		
		for(Animal ana :listOfAnimals) {
			System.out.println(ana.getName() + " " + ana.getAge());
		}
	}
}
