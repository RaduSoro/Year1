
public abstract class Appliance {
	private String name;
	private Meter meter;
	
	//constructor
	protected Appliance(String ApplianceName) {
		this.name=ApplianceName;
	}
	
	protected String getName() {
		return this.name;
	}
	
	public void setMeter(Meter name) { //sets the appropiate meter for this class
		this.meter=name;
	}
	
	public abstract void timePasses(); //runs for 1 hr
	
	protected void tellMeterToConsumeUnits(float unitsConsumed) {
		this.meter.consumeUnits(unitsConsumed);
		//System.out.println("The meter " + this.meter.utilityName +" consumed ");
		
	}
	
}
