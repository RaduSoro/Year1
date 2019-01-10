import java.io.*;
public class cfgReader {

		private House myHouse;
		private String name, meter, subClass,minUnits, maxUnits, fixedUnits, probMin, probMax, cycleLength;
		String[] aux;
		int counter=0;
		
		//cosntructor
		public cfgReader(House house){
			this.myHouse=house;
		}
	
       public void readFromCfg(String fileLoc) {
    	   
    	   File file = new File(fileLoc); 
     	  BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("The file has not been found!");
		} 
     	  
     	  String st; 
     	  try {
			while ((st = br.readLine()) != null) {
					whatIsThis(st);
					counter++;
					if(counter==9) {
						createAppliance();
						counter=0;
					}
						
			  }
		} catch (IOException e) {
			System.out.println("IO EXCEPTION");
		}
     	  
       }
       private void whatIsThis(String ph) {
    	   //name
    	   if(ph.contains("name:")) {
				aux = ph.split(": ");
				name = aux[aux.length-1];
				System.out.println(name + " has been added to the house");
    	   }else if(ph.contains("subclass:")) {
    		   aux = ph.split(": ");
    		   subClass = aux[aux.length-1];
    	   }else if(ph.contains("meter:")) {
    		   aux = ph.split(": ");
    		   meter = aux[aux.length-1];
    	   }else if(ph.contains("Min units consumed:")) {
    		   aux = ph.split(": ");
    		   minUnits = aux[aux.length-1];
    	   }else if(ph.contains("Max units consumed:")) {
    		   aux = ph.split(": ");
    		   maxUnits = aux[aux.length-1];
    	   }else if(ph.contains("Fixed units consumed:")) {
    		   aux = ph.split(": ");
    		   fixedUnits = aux[aux.length-1];
    	   }else if(ph.contains("Probability switched on:")) {
    		   aux = ph.split(": ");
    		   if(aux.length>1) {
    			  String[] second;
    			  second=aux[1].split("in");
    			  probMin=second[0].substring(0, 1);
    			  probMax=second[1];
    		   }else
    			   probMax = aux[aux.length-1];
    	   }else if(ph.contains("Cycle length:")) {
    		   aux = ph.split(": ");
    		   if(aux.length>1)
    			   cycleLength= ph.substring(ph.indexOf(": ")+1, ph.indexOf("/"));
    		
    	   }
       }
       
       private void detectMeterType(String meterName, Appliance ap) {
    	   if (meterName.toLowerCase().equals("electric")) {
    		   myHouse.addElectricAppliance(ap);
    	   }else
    		   myHouse.addWaterAppliance(ap);
    		       	   	
       }

       private void createAppliance() {
    	   switch(subClass) {
    	   case "CyclicFixed":
    		   CyclicFixed cF = new CyclicFixed(Float.valueOf(fixedUnits), Double.valueOf(cycleLength),name);
    		   detectMeterType(this.meter, cF);
    		   
    		   break;
    	   case "CyclicVaries":
    		   CyclicVaries cV = new CyclicVaries(Float.valueOf(minUnits), Float.valueOf(maxUnits), Double.valueOf(cycleLength), name);
    		   detectMeterType(this.meter, cV);
    		   break;
    	   case "RandomFixed":
    		  
    		   RandomFixed rF = new RandomFixed(Float.valueOf(fixedUnits) , Double.valueOf(probMin), Double.valueOf(probMax), name);
    		   detectMeterType(this.meter, rF);
    	
    		   break;
    	   case "RandomVaries":
    		   RandomVaries rV = new RandomVaries(Float.valueOf(minUnits),Double.valueOf(probMin),Double.valueOf(probMax),Float.valueOf(maxUnits),name);
    		
    		   detectMeterType(this.meter, rV);
    		   break;
    		   default :
    			   System.out.println("CFG error the device isn't any of the subclasses");
    			   break;
    	   }
       }     	
}
