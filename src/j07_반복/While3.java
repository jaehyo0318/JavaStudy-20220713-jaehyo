package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("반복 횟수를 입력하세요: ");
		n = scanner.nextInt();
		
		int i = 0;

		while(i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		i = 0;
		System.out.println();
		
		while(i < n) {
			System.out.println("i = " + (n - i));
			i++;
		}
	}

}
