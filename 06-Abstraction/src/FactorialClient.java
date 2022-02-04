
public class FactorialClient {

	public static void main(String[] args) {
		
		FactorialCalculator fc = new FactorialCalculator();
		fc.setNumber(7);
		
		System.out.println("Factorial of given number: "+fc.calculateFactorial());

	}

}
