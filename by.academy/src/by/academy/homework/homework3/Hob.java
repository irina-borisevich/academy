package by.academy.homework.homework3;

public class Hob extends Product {
	public static final double HOB_DISCOUNT = 0.75;
	private String type;  // газовые; электрические; комбинированные
    private boolean induct;
    
    public Hob() {
		super();
	}
    
    public Hob(String title, double price, int quantity, String type, boolean induct) { 
		super(title, price, quantity);
		this.type = type;
		this.induct = induct;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getInduct() {
		return induct;
	}

	public void setInduct(boolean induct) {
		this.induct = induct;
	}
	
	@Override
	public double discount() {
		if (induct) {
			return HOB_DISCOUNT;
		}
		return 1;
	}
}
