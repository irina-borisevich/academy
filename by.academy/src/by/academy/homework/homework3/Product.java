package by.academy.homework.homework3;

public abstract class Product { 
	protected String title;
	protected double price;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String type, double price, int quantity) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String type) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
	public final double calcTotalPrice() {
		return quantity * price * discount();
	}

	public abstract double discount();
	
}
