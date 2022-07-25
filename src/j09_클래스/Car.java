package j09_클래스;

public class Car {

	String company;
	String model;
	String color;
	Car() { // 기본 생성자, 생략되어 있음
		// 생성자는 무조건 주소값을 리턴
		// return 자료형도 생략되어 있음  return이 무조건 주소값이기 때문
		System.out.println("생성자 호출?");
	}
	void showCarInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("------------------");
	}
}
