import java.util.Random;
public class CyclicVaries extends Appliance {
	private float consumedUnits;
	private double hrsOn;
	private float maxCons;
	private float minCons;
	private int localTime=1;
	//RANDOM NUMBER GENERATOR rng
	Random rng = new Random();
	 /*** Constructor with the input of minimum consumption max consumption timeOn and name
	 *  EXAMPLE:
	 * CyclicVaries cooker = new CyclicVaries(4,18,2,"Cooker");//consMin, consMax,timeOn,name
	 ***/
	public CyclicVaries(float consumptionMin, float consumptionMax , double timeOn , String ApplianceName) {
		super(ApplianceName);
		this.maxCons = consumptionMax;
		this.minCons = consumptionMin;
		this.hrsOn=timeOn;
		
	}
	
	@Override
	public void timePasses() { //generates how many units have been used after 1 cycle(1 hr)
		
		if(localTime==25) {
			localTime=1;
		}
		
		if(localTime<=hrsOn) {
			//rng.nextInt generates a random number between a & b, given the arguments a and b
			//where a is max and b is min .nextInt(a-b+1)+b; 
			consumedUnits=minCons+rng.nextFloat()*(maxCons-minCons);
			super.tellMeterToConsumeUnits(this.consumedUnits);
		} 
		localTime++;
	
	}
	

}
