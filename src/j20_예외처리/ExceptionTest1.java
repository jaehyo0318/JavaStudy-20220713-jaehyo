package j20_예외처리;

import javax.management.BadAttributeValueExpException;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		int[] numArray = new int[] { 1, 2, 3, 4, 5 };
		
		
		for(int i = 0; i < 6; i++) {
			try {				
				System.out.println(numArray[i]);
				if(1 == 1) throw new BadAttributeValueExpException(null);
				//throw는 예외를 강제적으로 생성
				System.out.println("예외 이후에 정의된 실행문");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");
				
			} catch (NullPointerException e) {
				System.out.println("값이 비었습니다.");
				
			} catch (Exception e) {
				System.out.println("무슨 예외인지는 모르겠지만 예외가 발생하면 무조건 처리");
				e.printStackTrace(); // 예외가 무엇인지 보여줌
				
			} finally { //예외가 발생해도, 안해도 실행되는 것이라고 명시
				System.out.println("모조건 실행");
				// 지금까지 오류없이 동작한 것을 저장
			}
		}
		System.out.println("프로그램 종료");
		
	}
	
}
