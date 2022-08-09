package j15_스태틱;

import j01_출력.PrintTest;

public class StaticMain {

	public static void main(String[] args) {
		StaticTest.name = "서재효";
		StaticTest.printTest();
		
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "서재효";
		
		System.out.println(staticTest.name);
		staticTest.printTest();
//
//		StaticTest staticTest2 = new StaticTest();
//		staticTest2.name = "서재희";
//		System.out.println(staticTest2.name);
//		
//		System.out.println(staticTest.name);
		
		
		
	}

}
