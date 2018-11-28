
public abstract class Appliance {
	private String name;
	private Meter meter;
	
	//constructor
	protected Appliance(String ApplianceName) {
		this.name=ApplianceName;
	}
	
	public void setMeter(Meter name) { //sets the appropiate meter for this class
		this.meter=name;
	}
	
	public abstract void timePasses(); //runs for 1 hr
	
	protected void tellMeterToConsumeUnits(float unitsConsumed) {
		meter.consumeUnits(unitsConsumed);
	}
	
}
