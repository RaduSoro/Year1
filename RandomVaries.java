import java.util.Random;
public class RandomVaries extends Appliance{
	private float consumedUnits;
	private float maxCons;
	private float minCons;
	private int onlineChanche;
	private double probMax,probMin;
	//RANDOM NUMBER GENERATOR rng
	Random rng = new Random();
	
	/*** 
	 * Constructor with the input of consumption max timeOn and name
	 * EXAMPLE:
	 * CyclicFixed fridge = new CyclicFixed(2,25,"Fridge");//consumption, timeon, name
	***/
	public RandomVaries(float consumptionMin,double probMin, double probMax, float consumptionMax , String ApplianceName) {
		super(ApplianceName);
		this.maxCons = consumptionMax;
		this.minCons = consumptionMin;
		this.probMax=probMax;
		this.probMin=probMin;
	}
	
	@Override
	public void timePasses() { //generates how many units has been used after 1 cycle(1 hr)
		//generates a random variable from 1 to 6, if it's one it will consume the rng units
		//this.onlineChance = rng.nextInt(2);
		this.onlineChanche = rng.nextInt(((int)probMax)+(int)probMin);
		if(onlineChanche==probMin) {
			consumedUnits=minCons+rng.nextFloat()*(maxCons-minCons);
					

			super.tellMeterToConsumeUnits(consumedUnits);
		}
	}
	

}
