
public class BatteryMeter extends Meter{
	
	private Battery myBattery = new Battery();
	
	//links the meter to a battery
	public BatteryMeter(String uName, double uCost, float mReading) {
		super(uName, uCost, mReading);
	}
	
	//basically the same meter as the other one but makes
	//the appliances consume the electricity from the battery on the next time passed
	//and it stores energy inside the battery if the production is bigget than the demand
	public float report () {
		if(super.meterReading>0) {
			//if the utility stored is bigget than the consumption
			if(super.meterReading<myBattery.energyStored()) {
				//float price = (myBattery.energyStored()-super.meterReading)*(float)super.unitCost;
				//System.out.println(super.utilityName + ": " + super.meterReading + " units used");
				myBattery.modifyEnergyLeveles((myBattery.energyStored()-super.meterReading));
				super.meterReading=0;
				return 0;
			}//if the battery has less change than the meter needs returns the price after the 
			//utility in battery its used
			else {
				float price = (super.meterReading-myBattery.energyStored())*(float)super.unitCost;
				System.out.println(super.utilityName + ": " + super.meterReading + " units used");
				myBattery.modifyEnergyLeveles((super.meterReading-myBattery.energyStored()));
				super.meterReading=0;
				return price;
			}
			
			
		//if the meter is negative after the consumption it means energ was generated and add the
		//units to the battery
			
		}else {
			System.out.println(super.utilityName + " " + super.meterReading*-1 +"units generated");
			myBattery.modifyEnergyLeveles(super.meterReading);
			super.meterReading=0;
			return 0;
		}
		
	}
		
}