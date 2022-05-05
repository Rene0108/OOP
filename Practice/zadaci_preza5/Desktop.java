package zadaci_prez5;

public class Desktop extends Computer {

	private double caseHeight;

	public double getCaseHeight() {
		return caseHeight;
	}

	public void setCaseHeight(double caseHeight) {
		this.caseHeight = caseHeight;
	}
	
	public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
		super(model, manufacturer, operatingSystem);
		this.caseHeight = caseHeight;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Case Height: %.2f\n", super.toString(), this.getCaseHeight() );
	}
	
	public String getComputerType() {
		return "desktop computer";
	}
	
	public int calculatePortabilityScore() {
		return 5 + ( (int)caseHeight / 30);
	}
}
