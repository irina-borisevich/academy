package by.academy.lesson3.cat;

public class Application {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("������");
		
		System.out.println("cat1");
//		cat1.eat();
		cat1.grow();
//		cat1.walk();
//		cat1.slepp();

		System.out.println("cat2");
//		cat2.eat();
		cat2.grow();
//		cat2.walk();
//		cat2.slepp();	
		System.out.println("cat2");
	}

}
