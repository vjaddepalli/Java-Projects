
public class AccClient {

	public static void main(String[] args) {
		
		Account acc=new Account();
		acc.balance=12000;
		acc.typeOfAccount=2;
		System.out.println("Interest: "+acc.getInterestAmount());

	}

}
