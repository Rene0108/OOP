package zadaci_prez3;

/***
 * 
 * 1. Napravite klasu FoodType koja ima sljedeæe javne atribute: name (String), protein (int), carbs (int), fat(int). 
 * Atributi protein, carbs i fat su postoci.
 * 
 * 2. Promijenite klasu FoodType tako da su atributi privatni. 
 * Dodajte klasi konstruktor koji prima kao parametre sve vrijednosti za atribute. 
 * Napravite get metode za svaki atribut.
 * 
 * 3. Dodajte u klasi FoodType javnu metodu toString koja nema argumenata, a vraæa String koji predstavlja objekt. 
 * Ako atributi imaju vrijednost: name=banana, protein=4, carbs=93, fat=3 onda je String koji se vraæa: "banana: p - 4%, c - 93%, f - 3%".
 * 
 * 4. Napravite statièku varijablu counter koja sadrži broj kreiranih objekata iz klase FoodType. 
 * Varijabla counter prilikom deklaracije postavlja vrijednost 0, a u konstruktoru se poveæava za jedan. 
 * Napravite statièku metodu getNumberOfCreatedInstances koja vraæa counter.
 * 
 * 5. Napravite klasu Food koja ima dva atributa: type (FoodType), weight(int). Težina je u gramima. 
 * Napravite konstruktor sa svim atributima te dodajte get metode i metodu toString koja nema argumenata i vraæa String 
 * koji predstavlja objekt u sljedeæem formatu: "banana: p - 4%, c - 93%, f - 3%, w – 110g".
 * 
 * @author osoba1
 *
 */

public class FoodType {

	private String name;
	private int protein;
	private int carbs;
	private int fat;
	
	private static int counter = 0;
	
	public FoodType(String name, int protein, int carbs, int fat ) {
		this.name = name;
		this.protein = protein;
		this.carbs = carbs;
		this.fat = fat;
		counter++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCarbs() {
		return carbs;
	}
	
	public int getFat() {
		return fat;
	}
	
	public int getProtein() {
		return protein;
	}
	
	@Override
	public String toString() {
		return name + ": p - " + protein + "%, c - " + carbs + "% , f - " + fat + "%";
	}
	
	public static int getNumberOfCreatedInstances() {
		return counter;
	}
	
}
