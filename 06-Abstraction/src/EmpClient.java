
public class EmpClient {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.basicSalary = 28000;
		e1.grade = 'A';
		System.out.println(".......Employee One Details.......");
		System.out.println("Allownce: " + e1.getAllowance());
		System.out.println("Net Salary: " + e1.getNetSalary());

		Employee employee = new Employee();
		employee.basicSalary = 12000;
		employee.grade = 'B';
		System.out.println(".......Employee Two Details.......");
		System.out.println("Allowance: " + employee.getAllowance());
		System.out.println("Net Salary: " + employee.getNetSalary());

	}

}
