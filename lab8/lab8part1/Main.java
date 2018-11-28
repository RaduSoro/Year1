
public class Main {
	public static void main(String args[]) throws Exception{
		
		//creates 2 new objects beef and cactus for the meat class respectively plant
		Meat beef= new Meat("Beef");
		Plant cactus = new Plant("Cactus");
		
		//creates a new wolf with and makes it do a noise
		//System.out.println("Creating a new wolf with the name Ben and age 10");
		Wolf wolf= new Wolf("Ben", 10);
		System.out.println("The wolf " + wolf.getName() + " has " + wolf.getAge() + " years");
		System.out.println(wolf.getName() + " is making a noise: ");
		wolf.makeNoise();
		System.out.println();
		Wolf wolf2 = new Wolf();
		System.out.println("The wolf " + wolf2.getName() + " has " + wolf2.getAge() + " years");
		System.out.println();
		
		//creates a new parrot and it makes it do a noise
		//System.out.println("Creating a new parrot with the name Glen and age 2");
		Parrot parrot= new Parrot(2);
		System.out.println("The parrot " + parrot.getName() + " has " + parrot.getAge() + " years");
		System.out.println(parrot.getName() + " is making a noise: ");
		parrot.makeNoise();
		System.out.println();
		
		
		//creates a new Zebra and makes a noise
		//System.out.println("Creating a new zebra with the name Miky and age 5");
		Zebra zebra = new Zebra("Miky", 5);
		System.out.println("The zebra " + zebra.getName() + " has " + zebra.getAge() + " years");
		System.out.println(zebra.getName() + " is making a noise: ");
		zebra.makeNoise();
		//zebra.eat(beef);
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
	}
}
