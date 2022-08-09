package j15_스태틱;

public class MainStaticTest {

	public void printTest() {
		System.out.println("출력");
	}
	
	public static void staticPrintTest() {
		System.out.println("스태틱 메소드 출력");
	}
	
	public static void main(String[] args) {
		MainStaticTest mainStaticTest = new MainStaticTest();
		mainStaticTest.printTest(); // main이 스태틱이기 때문에 생성을 하지 않으면 메소드 실행 안됨
		staticPrintTest();
	}

}
