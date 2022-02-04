
public class PrimeNumberClient {

	public static void main(String[] args) {
		
		PrimeNumberDecider pnd =new PrimeNumberDecider();
        
		pnd.setNumber(5);
		
		System.out.println("Is Prime: "+pnd.isPrime());

	}

}
