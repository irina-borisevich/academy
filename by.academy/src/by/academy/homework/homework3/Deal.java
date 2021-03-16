package by.academy.homework.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal {
	private String date;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCount;

	LocalDate currdate = LocalDate.now();
	LocalDate deadline = currdate.plusDays(10);
	
	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer, Product[] products) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) { 
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	//	@Override
//	public void addProduct(Product product) {
//
//		if (products == null) {
//			products = new Product[DEFAULT_PRODUCT_SIZE];
//		} else {
//			if (productCount + 1 > products.length) {
//				expandProductArray();
//			}
//		}
//		products[productCount++] = product;
//	}

//	@Override
//	public void deleteProduct(int index) {
//
//		if (index > products.length || index < 0) {
//			System.out.println("Index of bound");
//			return;
//		}
//		if (productCounter != index) {
//			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
//		}
//		products[productCounter] = null;
//		productCounter--;
//	}

//	private void expandProductArray() {
//		Product[] tempArray = new Product[products.length * 2 + 1];
//		System.arraycopy(products, 0, tempArray, 0, products.length);
//		products = tempArray;
//	}

	public void printBill() {
		double fullSum = 0;
		double discSum = 0;
		System.out.println("Сделка совершена. ");
		System.out.println("Дата сделки: date");
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity();
			double discProductPrice = product.calcTotalPrice();
			fullSum += totalProductPrice;
			discSum += discProductPrice;
			
			System.out.println("   Продукт: " + product.title);
			System.out.println("      Цена: " + product.price);
			System.out.println("Количество: " + product.quantity);
			
			if (product.discount() != 1) {
			System.out.println("    Скидка: " + product.discount());
			}   
			
			System.out.println("Стоимость продукта: " + product.getPrice() + "*"
					+ product.getQuantity() + "=" + totalProductPrice);
			
			System.out.println("Стоимость продукта со скидкой: " + discProductPrice);
			System.out.println("--------------------------------------------------");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Сумма всей сделки " + fullSum);
		System.out.println("Сумма всей сделки с скидкой " + discSum);
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println();
	
		}
}