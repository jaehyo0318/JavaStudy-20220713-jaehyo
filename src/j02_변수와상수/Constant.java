package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER;
		// 상수 => final, 상수의 변수명은 전부 대문자로 스네이크 표기법사용
		// 값이 한번 정해지면 변환 x
		final int MIN_NUMBER = 0;
		
		MAX_NUMBER = 200;
		
		int number = 10;
		number = 30;
		
		System.out.println("최소값: " + MIN_NUMBER);
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + number);
		
		
	}

}
