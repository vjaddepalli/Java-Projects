
public class CustomerClient {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setId(102);
		customer.setBalance(10000);
		
		System.out.println("IS Good Customer: "+customer.isGoodCustomer());

	}

}
