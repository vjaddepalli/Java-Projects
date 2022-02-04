
public class EmpClient {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setBasicSalary(10000);
		e1.setGrade('A');
		System.out.println(".......Employee One Details.......");
		System.out.println("Allownce: " + e1.getAllowance());
		System.out.println("Net Salary: " + e1.getNetSalary());

		Employee employee = new Employee();
		employee.setBasicSalary(12000);
		employee.setGrade('C');
		System.out.println(".......Employee Two Details.......");
		System.out.println("Allowance: " + employee.getAllowance());
		System.out.println("Net Salary: " + employee.getNetSalary());

	}

}
