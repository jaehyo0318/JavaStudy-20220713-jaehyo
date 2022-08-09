package j15_스태틱;

public class StaticTest {
	
	public static String name;
	private int age;
	
	public static void printTest() {
		System.out.println("출력");
		System.out.println(name);
//		System.out.println(age); => 스태틱 메소드 안에 일반변수 사용 불가
	}
	
}
