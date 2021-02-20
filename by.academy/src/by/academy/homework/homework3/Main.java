package by.academy.homework.homework3;

import java.util.Scanner;
import by.academy.homework.homework3.Deal;

public class Main {
	public static final int MAX_PRODUCTS = 3;

	private static void Menu() {
		System.out.println("Enter command: ");
		System.out.println("-----------------");
		System.out.println("1. Execute deal");
		System.out.println("2. Print bill");
		System.out.println("3. Insert product");
		System.out.println("4. Remove product");
		System.out.println("Exit");
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		manageDeal(scn);
		scn.close();
	}

	private static void manageDeal(Scanner scn) {
		Menu();
		String choice = scn.next();

		enterProduct: {
			while (!"Exit".equals(choice)) {
				switch (choice) {
				case "1":
					ExecuteDeal();
					break;
				case "2":
					
					break;
				case "3":
					System.out.println("Insert product");
					break;
				case "4":
					System.out.println("Remove product");
					break;
				case "Exit":
					break enterProduct;
				default:
					System.out.println("Invalid input! Pleas1e enter command again:");
				}
				Menu();
				choice = scn.next();
			}
			scn.close();
		}
	}

	public static void ExecuteDeal() { 
		Scanner scn = new Scanner(System.in);

		System.out.print("Дата сделки: ");
		String date = scn.nextLine();

		System.out.println("Продавец: ");
		Person seller = new Person();
		seller.enterPerson();

		System.out.print("Покупатель: ");
		Person buyer = new Person();
		buyer.enterPerson();

		Product[] products = new Product[MAX_PRODUCTS];
		for (int i = 0; i < products.length; i++) {
			products[i] = inputProduct();
		}

		Deal deal = new Deal(date, seller, buyer, products);
		deal.printBill();
	}

	private static Product inputProduct() {
		Scanner scn = new Scanner(System.in);

		for (;;) {
			System.out.println("Input № product: 1 - Foto, 2 - Fridge, 3 - Hob");
			Integer sel = scn.nextInt();
			
			if ((sel != 1) && (sel != 2) && (sel != 3)) { 
				System.err.println("Unknown product");
			} else {
				System.out.println("Name: ");
				String title = scn.next();

				System.out.println("Price: ");
				Double price = scn.nextDouble();

				System.out.println("Quantity: ");
				Integer quantity = scn.nextInt();
				
				Product product = null;
	
				switch (sel) {
				case 1:
					System.out.println("Megapixels: ");
					Integer megapx = scn.nextInt();

					System.out.println("Digital (true/false): ");
					Boolean digital = scn.nextBoolean();

					Camera camera = new Camera();
					camera.setMegapix(Integer.valueOf(megapx));
					camera.setDigital(Boolean.valueOf(digital));

					product = camera;
					break;
				case 2:
					System.out.println("Color:");
					String color = scn.next();

					Fridge fridge = new Fridge();
					fridge.setColor(color);
					
					product = fridge;
					break;
				case 3:
					System.out.println("Type (gas; electrical; combined):");
					String type = scn.next();

					System.out.println("induction (true/false): ");
					Boolean induct = scn.nextBoolean();

					Hob hob = new Hob();
					hob.setType(type);
					hob.setInduct(Boolean.valueOf(induct));
					
					product = hob;
					break;	
				}

				product.setTitle(title);
				product.setPrice(Double.valueOf(price));
				product.setQuantity(Integer.valueOf(quantity));

				return product;
			}		
		}
	}
}
