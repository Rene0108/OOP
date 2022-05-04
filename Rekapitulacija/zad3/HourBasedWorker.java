package zad3;

public class HourBasedWorker extends Worker {
    
	private static final double MONTHLY_WORKING_HOURS = 160;
	private static final double OVERTIME_FACTOR = 1.2;
	
	private double workingHours;
	private double salaryPerHour;
	
	public HourBasedWorker(String name, String bankNumber, double salaryPerHour) {
		super(name, bankNumber);
		this.salaryPerHour = salaryPerHour;
	}
	
	public double getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public void paySalary(BankManager bm) {
		double amount;
		if (workingHours <= MONTHLY_WORKING_HOURS) {
			amount = workingHours * salaryPerHour;
		}
		else {
			amount = (MONTHLY_WORKING_HOURS * salaryPerHour) + ((workingHours - MONTHLY_WORKING_HOURS) * salaryPerHour * OVERTIME_FACTOR);
		}
		bm.payment(this, amount);
	}
}
