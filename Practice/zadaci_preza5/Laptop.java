package zadaci_prez5;

public class Laptop extends Computer implements Portable{

	private int batteryCapacity;
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(int x) {
		this.batteryCapacity = x;
	}
	
	public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
		super(model, manufacturer, operatingSystem);
		this.weight = weight;
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Battery Capacity: %d\n - Weight: %.2f\n", super.toString(), this.batteryCapacity, this.weight );
	}
	
	public String getComputerType() {
		return "laptop computer";
	}
	
	public int calculatePortabilityScore() {
		return (int) weight;
	}
}
