import java.util.Random;
public class RandomFixed extends Appliance{
	private float consumedUnits;
	private int onlineChanche;
	//RANDOM NUMBER GENERATOR rng
	Random rng = new Random();
	
	/*** 
	 * Constructor with the input of consumption max timeOn and name
	 * EXAMPLE:
	 * CyclicFixed fridge = new CyclicFixed(2,25,"Fridge");//consumption, timeon, name
	***/
	public RandomFixed(float consumption , String ApplianceName) {
		super(ApplianceName);
		this.consumedUnits=consumption;
	}
	
	@Override
	public void timePasses() { //generates how many units has been used after 1 cycle(1 hr)
		//generates a random variable from 1 to 6, if it's one it will consume 2 units
		this.onlineChanche = rng.nextInt((6)+1);
		if(onlineChanche==1) {
			super.tellMeterToConsumeUnits(consumedUnits);
		}
	}
	

}
