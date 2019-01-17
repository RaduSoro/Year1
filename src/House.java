import java.util.*;
public class House {
	Meter electric;
	Meter water;
	float totalEl, totalWat, combinedPr;
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
	

	public static void main(String args[]){

		
		Meter battery = new BatteryMeter("Electricity", 0.013, 0);
		Meter water = new Meter("Water", 0.002, 0);
		House myHouse =  new House(battery, water);

	
		cfgReader cfg = new cfgReader(myHouse);
		System.out.println("Reading the appliances from the config file...");
		
		int hrsActive=168;
		if(args.length>1){
			hrsActive = Integer.parseInt(args[1]);
		}
		
			cfg.readFromCfg(args[0]);
		
	
		
		
		System.out.println("Number of devices found in the config file and added to the house " + myHouse.appliances.size());
		myHouse.activate(hrsActive);
	}
	//overloaded activate
	protected void activate(int numberOfHours) {
		//runs a timePasses for all the instances of the house
		for(int i=1;i<=numberOfHours;i++) {
			
			for(Appliance aux : appliances) {
				//System.out.println("Simulating appliance " + aux.getName());
				
				aux.timePasses();
			}
			System.out.println("Consummed after " + i +" hours");
			totalEl+=this.electric.report();
			totalWat+=this.water.report();
			
			combinedPr=totalEl+totalWat;
			
			System.out.println();
		}
		System.out.println("After " + numberOfHours + " hours, the house consumed £" + totalEl +" worth of electricity  £" +totalWat+" worth of water £" + (totalEl+totalWat)+ " worth combined");
		//returns the sum of the meters
		//return this.electric.report() + this.water.report();	
	}

}
