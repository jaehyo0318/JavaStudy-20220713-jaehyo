package j09_클래스;

/*
 * 클래스: Car
 * 변수
 * 		 company
 * 		 model
 * 		 color
 * 메소드
 * 		 showCarInfo()
 * 			제조사: 
 * 			모델:
 * 			색상:
 * 3대
 * 현대자동차
 * 쏘나타
 * 화이트
 * 
 * 기아
 * k5
 * 블랙
 * 
 * 현대자동차
 * 아반뗴
 * 그레이
 * 		
 */

public class CarMain {

	public static void main(String[] args) {
		System.out.println((new Car()).toString());
		// == System.out.println(new Car());
		Car c1 = new Car(); // 무조건 주소값 리턴
		Car c2 = new Car();
		Car c3 = new Car();

		c1.company = "현대자동차";
		c1.model = "쏘나타";
		c1.color = "화이트";
		
		c2.company = "기아";
		c2.model = "k5";
		c2.color = "블랙";
		
		c3.company = "현대자동차";
		c3.model = "아반떼";
		c3.color = "그레이";
		
		c1.showCarInfo(); // return이 없는 void여서 변수에 담을 수 없음
		c2.showCarInfo();
		c3.showCarInfo();
		
		
	}

}
