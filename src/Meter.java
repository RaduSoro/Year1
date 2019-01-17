
public class Meter {
	protected String utilityName; //electric or water
	protected double unitCost; //the cost of one unit for electric or water
	protected float meterReading; //balance of units
	
	//constructor
	 public Meter(String uName, double uCost, float mReading){
		this.utilityName = uName;
		this.unitCost = uCost;
		this.meterReading= mReading;
		
	}
		
	public void consumeUnits(float unitsToConsume) {
		this.meterReading=this.meterReading + unitsToConsume;
	}
	
	public float report() {
		
		
		if(this.meterReading>0) {
			float price = this.meterReading*(float)this.unitCost;
			System.out.println(this.utilityName + ": " + this.meterReading + " units used with the price of " + price);
			this.meterReading=0;
			return price;
		}else {
			System.out.println(this.utilityName + ": 0 units used");
			this.meterReading=0;
			return 0;
		}
		
	}
		
		
	
	
}
