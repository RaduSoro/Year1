
public class Battery {
	//when the generatotion of the electricity is negative the battery fills up.
	private float utilityStored = 0;
	private int capacityLimit=300;
	
	public float energyStored() {
		return utilityStored;
	}
	
	private void checkCap() {
		if(utilityStored>capacityLimit) {
			utilityStored=capacityLimit;
		}
		
	}
	
	//modifies the energy level
	//if the battery has positive energy it returns a 0
	//if the energy is negative it returns the negative number and sets the energy level
	//to 0
	protected void modifyEnergyLeveles(float extraUtil) {
		checkCap();
		
		if(utilityStored-extraUtil>0) {
			this.utilityStored=this.utilityStored-extraUtil;
			//return this.utilityStored;
		}
			
		else if(utilityStored-extraUtil<0) {
			this.utilityStored=this.utilityStored-extraUtil;
			float aux = utilityStored;
			utilityStored=0;
			//return aux*-1;
		}else {
			utilityStored=0;
			//return 0;
		}
		
		
			
		
		
	}
	
}
