
public class Customer {

	private int id;
	private String name;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	boolean isGoodCustomer() {
		if(this.balance<100000) 
			return true;
		return false;
		
	}

}
