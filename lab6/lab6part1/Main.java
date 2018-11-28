
public class Main {
	public static void main(String args[]){
		System.out.println("Creating a new wolf with the name Ben and age 10");
		Wolf ben= new Wolf("Ben", 10);
		System.out.println("The wolf has the following number of years: " + ben.getAge() );
		System.out.println( "And the name " + ben.getName());
		
		System.out.println("Creating a new parrot with the name Glen and age 2");
		Parrot glen= new Parrot("Glen" , 2);
		System.out.println("The parrot has the following number of years: " + glen.getAge() );
		System.out.println( "And the name " + glen.getName());
		
		Meat beef= new Meat("Beef");
		Plant cactus = new Plant("Cactus");
	}
}
