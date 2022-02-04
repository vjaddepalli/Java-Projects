
public class SalesEmployee extends Employee{
	
	private double incentive;

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	double computeNetSalary() {
		return this.getBasicSalary() + this.computeAllowance() - this.computeTax()+this.incentive;
	}


}
