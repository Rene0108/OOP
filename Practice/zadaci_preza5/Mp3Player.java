package zadaci_prez5;

public class Mp3Player extends Device implements Portable {

	private int batteryCapacity;
	private int memorySize;
	
	@Override
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	public Mp3Player(String model, String menufacturer, int batteryCapacity, int memorySize) {
		super(model, menufacturer);
		this.batteryCapacity = batteryCapacity;
		this.memorySize = memorySize;
	}
	
}
