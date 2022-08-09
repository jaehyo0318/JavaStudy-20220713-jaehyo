package j20_예외처리;

public class ExceptionTestMain {

	public static void main(String[] args) {
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		
		try {
			exceptionTest2.printArray();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException발생");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		System.out.println("프로그램 종료");

	}

}
