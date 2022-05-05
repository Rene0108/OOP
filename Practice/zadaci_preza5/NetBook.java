package zadaci_prez5;

/***
 * 
 * Napravite klasu Netbook koja nasljeðuje Laptop. 
 * Metoda calculatePortabilityScore u ovoj klasi uvijek vraæa score 1, a metoda getComputerType vraæa „netbook laptop computer“. 
 * Dodatno, onemoguæite daljnje nasljeðivanje klase Netbook.
 * 
 * 
 * @author osoba1
 *
 */

public final class NetBook extends Laptop {
    
	public NetBook(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
		super(model, manufacturer, operatingSystem, batteryCapacity, weight);
	}
	
	@Override
	public int calculatePortabilityScore() {
		return 1;
	}
	
	@Override
	public String getComputerType() {
		return "netbook laptop computer";
	}
}
