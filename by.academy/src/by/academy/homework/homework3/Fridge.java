package by.academy.homework.homework3;

public class Fridge extends Product {
	public static final double FRIDGE_DISCOUNT = 0.7;
	private String color;

	public Fridge() {
		super();
	}
	
	public Fridge(String title, double price, int quantity, String color) {
		super(title, price, quantity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double discount() {
		if (quantity > 1) {
			return FRIDGE_DISCOUNT;
		}
		return 1;
	}
}

