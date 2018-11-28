
public class Battery {
	//when the generatotion of the electricity is negative the battery fills up.
	private float utilityStored = 0;
	private int capacityLimit=100;
	
	public float energyStored() {
		return utilityStored;
	}
	
	//modifies the energy level
	//if the battery has positive energy it returns a 0
	//if the energy is negative it returns the negative number and sets the energy level
	//to 0
	protected void modifyEnergyLeveles(float extraUtil) {
			this.utilityStored=this.utilityStored-extraUtil;
			//chescks if the utility stored its bigger than capaicity limit
			//if it is it sets it to that number
			if(utilityStored>capacityLimit)
			utilityStored=capacityLimit;
		
		
	}
	
}
