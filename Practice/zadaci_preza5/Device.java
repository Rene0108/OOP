package zadaci_prez5;

/***
 * 
 * Napravite klasu Device koja opisuje neki generièki ureðaj. 
 * Neka Computer nasljeðuje Device. 
 * Kakva zbog toga mora biti klasa Device? 
 * Ima li smisla neke atribute iz Computer preseliti u Device? 
 * Takoðer, dodajte i klasu Mp3Player koja nasljeðuje Device, a ima atribute batteryCapacity(int) i memorySize (int). 
 * Uoèite da su neki od ureðaja prenosivi, npr. Mp3Player, Laptop i NetBook. 
 * Osigurajte da svi prenosivi ureðaji implementiraju metode getModel() i getBatteryCapacity().
 * 
 * 
 * @author osoba1
 *
 */

public class Device {

	private String model;
	private String manufacturer;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Device(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return String.format("Properties:\n - Model: %s\n - Manufacturer: %s\n", this.getModel(), this.getManufacturer());
	}
}
