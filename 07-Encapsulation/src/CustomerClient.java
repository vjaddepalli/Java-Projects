
public class CustomerClient {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setBalance(10000);
		customer.setId(101);
		customer.setName("Vijay");
		
		System.out.println("Namae: "+customer.getName());
		System.out.println("Id: "+customer.getId());
		System.out.println("Balance: "+customer.getBalance());
		System.out.print("Good Customer: "+customer.isGoodCustomer());

	}

}
