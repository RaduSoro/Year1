import java.util.Random;
public class CyclicVaries extends Appliance {
	private float consumedUnits;
	private double hrsOn;
	private float maixmumConsumption;
	private float minimumConsumption;
	private int localTime=1;
	//RANDOM NUMBER GENERATOR rng
	Random rng = new Random();
	 /*** Constructor with the input of minimum consumption max consumption timeOn and name
	 *  EXAMPLE:
	 * CyclicVaries cooker = new CyclicVaries(4,18,2,"Cooker");//consMin, consMax,timeOn,name
	 ***/
	public CyclicVaries(float consumptionMin, float consumptionMax , double timeOn , String ApplianceName) {
		super(ApplianceName);
		this.maixmumConsumption = consumptionMax;
		this.minimumConsumption = consumptionMin;
		this.hrsOn=timeOn;
		
	}
	
	@Override
	public void timePasses() { //generates how many units has been used after 1 cycle(1 hr)
		
		if(localTime==25) {
			localTime=1;
		}
		
		if(localTime<=hrsOn) {
			//rng.nextInt generates a random number between a & b, given the arguments a and b
			//where a is max and b is min .nextInt(a-b+1)+b; 
			this.consumedUnits=rng.nextInt((int) maixmumConsumption- (int)minimumConsumption+1)+minimumConsumption;
			super.tellMeterToConsumeUnits(this.consumedUnits);
		} 
		localTime++;
	
	}
	

}
