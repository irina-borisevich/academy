package by.academy.deal;

public class Product {
	String name;
	Double price;
	String manufacture;
	Integer quanity;
	
	public Product() {
		name = "name";
		price = 32.5;
		manufacture = "manufacture";
		quanity = 7;
	}
	
	public Product(String name,	Double price, String manufacture, Integer quanity) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quanity = quanity;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Integer getQuanity() {
		return quanity;
	}

	public void setQuanity(Integer quanity) {
		this.quanity = quanity;
	}

	
	class Wine extends Product {
		// тело класса
	}
	
	class Cheese extends Product {
		// тело класса
	}
	
//	class Application
}
