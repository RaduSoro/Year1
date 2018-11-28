
public class Main {
	public static void main(String args[]) throws Exception{
		
		Meat beef= new Meat("Beef");
		Plant cactus = new Plant("Cactus");
		
		
		System.out.println("Creating a new wolf with the name Ben and age 10");
		Wolf wolf= new Wolf("Ben", 10);
		System.out.println("The wolf " + wolf.getName() + " has " + wolf.getAge() + " years");
		System.out.println(wolf.getName() + " is making a noise: ");
		wolf.makeNoise();
		//wolf.eat(beef);
		System.out.println();
		
		System.out.println("Creating a new parrot with the name Glen and age 2");
		Parrot parrot= new Parrot("Glen" , 2);
		System.out.println("The parrot " + parrot.getName() + " has " + parrot.getAge() + " years");
		System.out.println(parrot.getName() + " is making a noise: ");
		parrot.makeNoise();
		//parrot.eat(cactus);
		System.out.println();
		
		
		System.out.println("Creating a new zebra with the name Miky and age 5");
		Zebra zebra = new Zebra("Miky", 5);
		System.out.println("The zebra " + zebra.getName() + " has " + zebra.getAge() + " years");
		System.out.println(zebra.getName() + " is making a noise: ");
		zebra.makeNoise();
		//zebra.eat(beef);
		System.out.println();
		
		
		try {
			zebra.eat(cactus);
			zebra.eat(beef);
			parrot.eat(beef);
			wolf.eat(cactus);
		} catch (Exception error) {
			System.err.println(error.getMessage());
		}
	}
}
