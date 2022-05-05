package zadaci_prez5;

/***
 * 
 * Napravite klasu Device koja opisuje neki generi�ki ure�aj. 
 * Neka Computer naslje�uje Device. 
 * Kakva zbog toga mora biti klasa Device? 
 * Ima li smisla neke atribute iz Computer preseliti u Device? 
 * Tako�er, dodajte i klasu Mp3Player koja naslje�uje Device, a ima atribute batteryCapacity(int) i memorySize (int). 
 * Uo�ite da su neki od ure�aja prenosivi, npr. Mp3Player, Laptop i NetBook. 
 * Osigurajte da svi prenosivi ure�aji implementiraju metode getModel() i getBatteryCapacity().
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
