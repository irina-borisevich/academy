package lesson4;

public class Main {

	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int min, m;
		int hor, h;
		int den, d;
		int week, w;
		
		sec = s % 60;
		m = (s - sec) / 60;
		
		min = m % 60;
		h = (m - min) / 60;
		
		hor = h % 24;
		d = (h - hor) / 24;
		
		den = d / 7;
		w = (d - den) / 7;
		
	
		
		System.out.println(d + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
		System.out.println(w + " недель ");

	}

}
