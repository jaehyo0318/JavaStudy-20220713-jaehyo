package j08_메소드;

public class Method2 {
	
	// 반환도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	//반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	

	//반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	//반환은 있고 매개변수가 없는 메소드
	public static int test4() { // int => 반환 자료의 자료형이 int
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	//반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		return name + index;
	}
	
	//반환값이 없는 메소드에서 메소드를 강제로 탈출하는 방법
	public static void test6(String names) {
		while(true) {
			int tokenIndex = names.indexOf(", ");
			String name = tokenIndex != -1 ?names.substring(0, tokenIndex)
					: names;
			
			System.out.println(name);
			
			if(names.equals("서재희")) {
				return; //메소드가 끝까지 안가고 빠져나가게 하는 것, 메소드 자체를 멈춤
			}
			
			if(tokenIndex == -1) {
				break; //반복만 멈춤
			}
			
			names = names.substring(tokenIndex + 2);
		}
		
		System.out.println("메소드가 정상적으로 종료되었음.");
	}
	public static void main(String[] args) {
		test1();
		test2(1234);
		test3(111,222);
		
		int a = test4();
		System.out.println(a);
		System.out.println(test4());
		
		test5("서재효", 1);
		String result = test5("서재효", 1);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		
		System.out.println();
		
		String names = "서재효, 서재호, 서재희, 서재현";
		test6(names);
		System.out.println("test6 메소드 실행 후 출력");
	}

}
