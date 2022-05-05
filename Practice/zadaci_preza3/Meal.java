package zadaci_prez3;

/***
 * 
 * Napravite klasu Meal kako je definirana u UML dijagramu klasa. Meal se sastoji od sastojaka (klasa Food).
Konstruktor prima varijabilni broj elemenata klase Food. Ne želimo da nam nitko izvan klase može mijenjati
sastojke. Kod vraæanja sastojka s indeksom koji ne postoji potrebno je vratiti vrijednost null.
 * @author osoba1
 *
 */

public class Meal {

	private Food[] ingredients;
	
	public Meal(Food...ingredients) {
	    this.ingredients = new Food[ingredients.length];
	    for (int i = 0; i < ingredients.length; i++) {
	      this.ingredients[i] = ingredients[i];
	    }
	  }
	
	public void printIngredients() {
		for(int i = 0; i < ingredients.length; i++) {
			System.out.printf("Ingredient[%d] = %s\n", i, this.ingredients[i].toStringInGrams());
		}
	}
	
	public int getNumberOfIngredients() {
		return ingredients.length;
	}
	
	public Food getIngredient(int index) {
		
		if(index < 0 || index >= ingredients.length)
		      return null;

		    return ingredients[index];
	}
}
