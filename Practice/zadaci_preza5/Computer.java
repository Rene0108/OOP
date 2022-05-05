package zadaci_prez5;

public abstract class Computer extends Device {
	
	private String operatingSystem;
	
	public abstract String getComputerType();
	
	public abstract int calculatePortabilityScore();
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	public Computer(String model, String manufacturer, String operatingSystem) {
		super(model, manufacturer);
		this.operatingSystem = operatingSystem;
	}
	
	@Override
	public String toString() {
		return String.format(" - Operating System: %s\n", super.toString(), this.getOperatingSystem());
	}

}
