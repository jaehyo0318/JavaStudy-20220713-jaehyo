package j19_익명클래스.람다식;

public class Main {
	
	public static void main(String[] args) {
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 20));		
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				System.out.println("value1: " + value1);
				System.out.println("value2: " + value2);
				return value1 + value2;
			}
		};
		System.out.println("-----plusMath2-----");
		System.out.println(plusMath2.calc(100.5, 200.5));		
		
		Math<Double, Double> plusMath3 = (v1, v2) -> {
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
			return v1 + v2;
			}; //익명클래스
		// (v1, v2), 매개변수/ ->, calc 메소드/ v1 + v2, return 
		//리턴에 {}가오면 다른 로직을 구현가능, return값에 return붙여줘야함
			
		Math<Double, Double> plusMath4 = (v1, v2) -> v1 + v2;

		System.out.println("-----plusMath3-----");
		System.out.println(plusMath3.calc(50.5, 10.4));
		System.out.println("-----plusMath4-----");
		System.out.println(plusMath4.calc(10.2, 20.1));
		
	}
}
