package j09_클래스.접근지정자.a;

public class TestA_2 {
	int ta2;

	public void testA2() {
		System.out.println("TestA_2 메소드 호출");
		System.out.println();
		
		TestA testA = new TestA(); // 메소드 안이면 어디서든 생성가능
		testA.ta1 = "테스트A_2에서 값 주입";
		testA.testA1();
		System.out.println(testA.ta1);
	}
}
