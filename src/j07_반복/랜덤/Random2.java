package j07_반복.랜덤;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		/*
		 * Random 클래스
		 * nextBoolean()
		 * nextInt()
		 * nextLoog()
		 * ...
		 * 
		 * 
		 */

		Random random = new Random();
				
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
			
			
			System.out.println((i + 1) + "번째\n" + "a: " + a + " b: " + b + " c: " + c);
			
			if(a > b && a > max) {
				max = a;
			}else if(max < b) {
				max = b;
			}
			if(max < c) {
				max = c;
			}
			
			System.out.println("현재 최대값: " + max);
			
			i++;
		}
		System.out.println("\n최종 최대값: " + max);
	}
	
}
