
public class Main {
	public static void main(String args[]){
	
		Toolbox myToolbox= new Toolbox();
		int i=1,sum=0,counter=0;
		int input = myToolbox.readIntegerFromCmd();
		int j;
		//for each j from 1 to 20 it prints out the j multiplied by the input
		for(j=1; j <= 20;j++) {
			System.out.println(j*input);
		}
		
		while(sum<500) {
			sum=sum+i;
			counter++;
			i++;
		}
		System.out.println(counter);
	
	}
	
}
