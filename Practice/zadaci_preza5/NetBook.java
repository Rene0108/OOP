package zadaci_prez5;

/***
 * 
 * Napravite klasu Netbook koja naslje�uje Laptop. 
 * Metoda calculatePortabilityScore u ovoj klasi uvijek vra�a score 1, a metoda getComputerType vra�a �netbook laptop computer�. 
 * Dodatno, onemogu�ite daljnje naslje�ivanje klase Netbook.
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
