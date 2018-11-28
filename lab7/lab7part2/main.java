
public class main {
	public static void main(String args[]){
		TestCalculator tester = new TestCalculator();

		Calculator myCalc = new Calculator();
		tester.testParser(myCalc);
		//tester.testPasser();
		tester.testAdd(myCalc);
		tester.testMultiplication(myCalc);
		
	}
	
}
