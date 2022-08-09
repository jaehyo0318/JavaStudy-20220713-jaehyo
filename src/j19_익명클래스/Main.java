package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.add(10, 20);
		abstractTest.showData("JSON");
		
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("더할 때 딱한번만 사용함.");
			}
		}; // {@Override}, 중괄호 사이 오버라이드 된 부분이 클래스
		// 클래스를 만들지 않고 해당 클래스에서만 일회용으로 만들어 사용
		
		abstractTest2.add(0, 0);
		abstractTest2.showData(null);
	}

}
