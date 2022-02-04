
public class HRClient {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("John");
		e.setBasicSalary(10000.00);
		System.out.println(e.computeNetSalary());
		
		SalesEmployee se = new SalesEmployee();
		se.setId(102);
		se.setName("Vikram");
		se.setBasicSalary(12000.00);
		se.setIncentive(1200.00);
		System.out.println(se.computeNetSalary());
		
		Manager m= new Manager();
		m.setId(103);
		m.setName("Vijay");
		m.setBasicSalary(20000.00);
		m.setVehicleAllowance(3000.00);
		System.out.println(m.computeNetSalary());

	}

}
