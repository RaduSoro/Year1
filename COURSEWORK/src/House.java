import java.util.*;
public class House {
	Meter electric;
	Meter water;
	ArrayList<Appliance> appliances = new ArrayList<Appliance>();
	
	//constructor
	protected House() {
		this.electric= new Meter("Electricity", 0.013, 0);
		this.water = new Meter("Water", 0.002, 0);
	}
	
	//constructor overloaded takes 2 meters as constructors
	protected House(Meter Meter1, Meter Meter2) {
			this.electric= Meter1;
			this.water = Meter2;
	}
	
	//adds the given appliance to the current house appliances array and sets the meter to electricity
	protected void addElectricAppliance(Appliance ap) {
		//adds the object to the house arraylist of appliances
		appliances.add(ap); 
		//gets the index value of the object that has been added
		int aux = appliances.indexOf(ap);
		//sets that object to have the meter of this house
		appliances.get(aux).setMeter(this.electric);
	}
	
	//adds the given appliance to the current house appliances array and sets the meter to water
	protected void addWaterAppliance(Appliance ap) {
		//adds the object to the house arraylist of appliances
		appliances.add(ap); 
		//gets the index value of the object that has been added
		int aux = appliances.indexOf(ap);
		//sets that object to have the meter of this house
		appliances.get(aux).setMeter(this.water);
	}
	
	//removes the given appliance object from the house appliances array
	protected void removeAppliance(Appliance ap) {
		appliances.remove(ap);
	}
	
	//returns an int with the number of appliances that are in the house currently
	protected int numAppliances() {
		return appliances.size();
	}
	
	//method that returns the sum of the meteres after the house ran for 1 hour
	protected float activate() {
		//runs a timePasses for all the instances of the house
		for(Appliance aux : appliances) {
			aux.timePasses();
		}
		//returns the sum of the meters
		return this.electric.report() + this.water.report();	
	}
	
	//overloaded activate
	protected float activate(int numberOfHours) {
		//runs a timePasses for all the instances of the house
		for(int i=0;i<numberOfHours;i++) {
			for(Appliance aux : appliances) {
				aux.timePasses();
			}
		
		}
		//returns the sum of the meters
		return this.electric.report() + this.water.report();	
	}

	public static void main(String args[]){

		CyclicFixed fridge = new CyclicFixed(2,25,"Fridge");//consumption, timeon, name
		CyclicFixed lights =  new CyclicFixed(6 , 5 , "Lights");
		CyclicVaries cooker = new CyclicVaries(4,18,2,"Cooker");
		RandomFixed TV = new RandomFixed(2,"TV");
		RandomVaries windTurbine = new RandomVaries(1,25,"Wind Turbine");
		Meter battery = new BatteryMeter("Electricity", 0.013, 0);
		Meter water = new Meter("Water", 0.002, 0);
		House myHouse =  new House(battery, water);

		myHouse.addElectricAppliance(fridge);
		myHouse.addElectricAppliance(lights);
		myHouse.addElectricAppliance(cooker);
		myHouse.addElectricAppliance(TV);
		myHouse.addElectricAppliance(windTurbine);
		int hrsActive=10000;
		System.out.println("Consumed after "+ hrsActive+" hours " + myHouse.activate(hrsActive) + "  ");
		try{
		cfgReader cfg = new cfgReader();

		} catch (Exception error) {
			System.err.println(error.getMessage());
	}
	
}
