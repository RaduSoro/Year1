import java.util.Random;
public class RandomVaries extends Appliance{
	private float consumedUnits;
	private float maximumConsumption;
	private float minimumConsumption;
	private int onlineChance;

	//RANDOM NUMBER GENERATOR rng
	Random rng = new Random();
	
	/*** 
	 * Constructor with the input of consumption max timeOn and name
	 * EXAMPLE:
	 * CyclicFixed fridge = new CyclicFixed(2,25,"Fridge");//consumption, timeon, name
	***/
	public RandomVaries(float consumptionMin, float consumptionMax , String ApplianceName) {
		super(ApplianceName);
		this.maximumConsumption = consumptionMax;
		this.minimumConsumption = consumptionMin;
	}
	
	@Override
	public void timePasses() { //generates how many units has been used after 1 cycle(1 hr)
		//generates a random variable from 1 to 6, if it's one it will consume the rng units
		this.onlineChance = rng.nextInt(2);
		if(onlineChance==1) {
			consumedUnits=rng.nextInt(((int)(maximumConsumption)-(int)minimumConsumption+1)+(int)minimumConsumption)*-1;//* -1 so the random number will be negative
			super.tellMeterToConsumeUnits(consumedUnits);
		}
	}
	

}
