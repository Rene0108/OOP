package zadaci_prez3;

public class Food {

	private FoodType type;
	private int weight;
	
	public Food(FoodType type, int weight) {
		this.type = type;
		this.weight = weight;
	}
	
	public FoodType getFoodType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return type.toString() + ", w – " + this.weight + "g";
	}
	
	public double getCarbs() {
		return ((double)this.type.getCarbs() / 100.) * this.weight ;
	}
	
	public double getFat() {
		return ((double)this.type.getFat() / 100.) * this.weight ;
	}
	
	public double getProtein() {
		return ((double)this.type.getProtein() / 100.) * this.weight ;
	}
	
	public String toStringInGrams() {
		return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg", type.getName(), getProtein(), getCarbs(), getFat());
	}
}
