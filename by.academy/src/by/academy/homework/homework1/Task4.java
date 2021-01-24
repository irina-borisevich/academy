package by.academy.homework.homework1;

public class Task4 {
// Возведение в степень двойки, пока результат не будет больше, чем 1_000_000. 	
	
	public static void main(String[] args) {
		int result = 2;
		int i = 1;
		
		while (result <= 1_000_000) {
			System.out.println("2 в степени " + i + " = " + result);
			result = result * 2;
			i++; 
		}				
	}
}
