
public class CyclicFixed extends Appliance{
	private float consumedUnits;
	private double hrsOn;
	private int localTime=1;
	
	/*** 
	 * Constructor with the input of consumption max timeOn and name
	 * EXAMPLE:
	 * CyclicFixed fridge = new CyclicFixed(2,25,"Fridge");//consumption, timeon, name
	***/
	public CyclicFixed(float consumption , double timeOn , String ApplianceName) {
		super(ApplianceName);
		this.consumedUnits=consumption;
		this.hrsOn=timeOn;
		
	}
	
	@Override
	public void timePasses() { //generates how many units has been used after 1 cycle(1 hr)
		
		if(localTime==25) {
			localTime=1;
		}
		
		if(localTime<=hrsOn) {
			super.tellMeterToConsumeUnits(consumedUnits);
		} 
		localTime++;
	
	}
	

}
