
public class TestCalculator {
	int ok=0;
	
	public boolean testPasser(Calculator myCalc) {
		 boolean pass=true;
		if(!(myCalc.x("12 + 5").equals(new Double(17)))) {
			
			System.out.println("[FAIL] Basic parsing fails to add.");
			pass=false;
		}else {
			System.out.println("[PASS] Basic parsing adds correctly.");
		}
		if(!(myCalc.x("12 x 5").equals(new Double(60)))) {
			System.out.println("[FAIL] Basic parsing fails to multiply.");
			pass=false;
		}else {
			System.out.println("[PASS] Basic parsing multiplies correctly.");
		}
		if(!(myCalc.x("12 [ 3").equals(null))) {
			pass=false;
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
		}else {
			System.out.println("[PASS] Basic parsing returns null correctly.");
		}
		return pass;
		
	}
	
	
	public boolean testAdd(Calculator myCalc) {
		myCalc.x=(Double) 5.0;
		boolean pass=true;
		if(!(myCalc.x((Double) 2.0).equals(new Double(7)))) {
			
			System.out.println("[FAIL] Calculator adds incorrectly");
			 pass=false;
		} else {
			System.out.println("[PASS] Calculator adds correctly");
		}
		
		myCalc.x=(double) -5;
		if(!(myCalc.x((Double) (-2.0)).equals(new Double(-7)))) {
			pass=false;
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
		}else {
			System.out.println("[PASS] Calculator adds with negative numbers correctly");
		}
		return pass;
	}
	
	
	public boolean testMultiplication(Calculator myCalc) {
		myCalc.x=(double) 5;
		boolean pass=true;
		if(!(myCalc.x((double) (2.0)).equals(new Double(10)))) {
			pass=false;
			System.out.println("[FAIL] Calculator multiplies incorrectly");
		}else {
			System.out.println("[PASS]  Calculator multiplies correctly");
		}
		
		myCalc.x=(double) -5;
		if(!(myCalc.x((double) (-2.0)).equals(new Double(10)))) {
			pass=false;
			System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
		}else {
			System.out.println("[PASS] Calculator multiplies by negative correctly");
		}
		return pass; 
	}
	
	public boolean testParser(Calculator myCalc) {
		boolean pass=true;
		if(myCalc.x("12+5").equals(new Double(17))) {
			System.out.println("[PASS]  Basic parsing adds correctly");
		}else {
			pass=false;
			System.out.println("[FAIL]  Basic parsing fails to add");
		}
		if(myCalc.x("12x5").equals(new Double(60))) {
			System.out.println("[PASS]  Basic parsing multiplies correctly");
		}else {
			pass=false;
			System.out.println("[FAIL]  Basic parsing fails to multiply");
		}
		if(myCalc.x("12[3")==null) {
			System.out.println("[PASS]  Basic parsing returns null on invalid operators");
		}else {
			pass=false;
			System.out.println("[FAIL]  Basic parsing does not return null on invalid operators");
		}
		
		return pass;
		
	}
		
	
}
