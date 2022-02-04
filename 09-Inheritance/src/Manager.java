
public class Manager extends Employee {
	
	private double vehicleAllowance;

	public double getVehicleAllowance() {
		return vehicleAllowance;
	}

	public void setVehicleAllowance(double vehicleAllowance) {
		this.vehicleAllowance = vehicleAllowance;
	}
	
	double computeNetSalary() {
		return this.getBasicSalary() + this.computeAllowance() - this.computeTax()+this.getVehicleAllowance();
	}


}
