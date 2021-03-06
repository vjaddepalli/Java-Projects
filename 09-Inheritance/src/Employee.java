
public class Employee {

	private int id;
	private String name;
	private double basicSalary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	double computeAllowance() {
		return 0.35 * this.basicSalary;
	}

	double computeTax() {
		return 0.10 * this.basicSalary;
	}

	double computeNetSalary() {
		return this.basicSalary + this.computeAllowance() - this.computeTax();
	}

}
