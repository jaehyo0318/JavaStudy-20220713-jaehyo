package j07_반복.랜덤;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i = 0;
		
		System.out.println("소희의 Lotto 1등 번호!!!!");
		while(i < 6) {
			int a = 0;
			a = random.nextInt(43) + 1;
			System.out.println("번호: " + a);
			i++;
		}

	}

}
