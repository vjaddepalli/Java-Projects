
public class Employee {

	private double basicSalary;
	private char grade;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		if(basicSalary<0) {
			System.out.println("Invalid Salary");
			return;
		}
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	double getAllowance() {

		double allowance;
		switch (grade) {
		case 'A':
			allowance = basicSalary * 0.35;
			break;
		case 'B':
			allowance = basicSalary * 0.28;
			break;
		case 'C':
			allowance = basicSalary * 0.20;
			break;
		default:
			System.out.println("Invalid Grade");
			allowance = 0;
			break;
		}
		return allowance;
	}

	double getNetSalary() {
		return basicSalary + getAllowance();
	}

}
