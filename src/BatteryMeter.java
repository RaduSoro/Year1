import java.util.Random;

public class BatteryMeter extends Meter{
	
	private Battery myBattery = new Battery();
	
	//links the meter to a battery
	public BatteryMeter(String uName, double uCost, float mReading) {
		super(uName, uCost, mReading);
	}
	
	private double feedInTariff() {
					java.util.Random rng = new java.util.Random();
		    double aux = rng.nextDouble() + 0.5;
		    return aux;
	}
	
	protected float decider() {
		//checks if the feed in tariff is bigger that the unit cost and if it is sell the electricity to the grid
		float price=0;
		if((feedInTariff()*super.unitCost>super.unitCost)&& myBattery.energyStored()>100) {
			price = (float) (super.unitCost*(myBattery.energyStored()/2));
			System.out.println("Selling " + myBattery.energyStored()/2 +" units to the grid with the price of " + price);
			myBattery.modifyEnergyLeveles(myBattery.energyStored()/2);
			
		}
		
		return price*-1;
	}
	
	//basically the same meter as the other one but makes
	//the appliances consume the electricity from the battery on the next time passed
	//and it stores energy inside the battery if the production is bigget than the demand
	public float report () {
		if(super.meterReading>0) {
			//if the utility stored is bigger than the consumption
			if(super.meterReading<myBattery.energyStored()) {
				
				System.out.println(this.utilityName + ": " + this.meterReading + " units used from the battery with the price of 0" );
				myBattery.modifyEnergyLeveles(super.meterReading);
				super.meterReading=0;
			
				System.out.println(" The new battery level is: " +myBattery.energyStored());
				System.out.println("Checking if the tariff level is higher to sell to grid...");
				
				return decider();
			}
			//if the battery has less change than the meter needs returns the price after the 
			//utility in battery its used
			else {
				float price = (super.meterReading-myBattery.energyStored())*(float)super.unitCost;
				System.out.println(this.utilityName + ": " + this.meterReading + " units used with the price of " + price);
				myBattery.modifyEnergyLeveles(myBattery.energyStored());
				super.meterReading=0;
				
				System.out.println("The new battery level is: " +myBattery.energyStored());
				return price;
			}
			
			
		//if the meter is negative after the consumption it means energ was generated and add the
		//units to the battery
			
		}else {
			System.out.println(super.utilityName + " " + super.meterReading*-1 +" units generated");
			
			myBattery.modifyEnergyLeveles(super.meterReading);
			super.meterReading=0;
			System.out.println("The new battery level is : "+ myBattery.energyStored());
			return 0;
		}
		
	}
		
}