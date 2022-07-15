package j03_연산자;
import java.util.Scanner;

public class Operation4 {

	public static void main(String[] args) {
		/*
		 * 시험 성적 결과 계산 프로그램
		 * score = 85
		 * 
		 * 1. score 0보다 작거나 100보다 크면 "계산불가"
		 * 2. 89보다 크면 "A학점" 
		 * 3. 79보다 크면 "B학점" 
		 * 4. 69보다 크면 "C학점" 
		 * 5. 59보다 크면 "D학점"
		 * 6. 나머지 "F학점" 
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요: ");
		String result = null;
		score = sc.nextInt();
		System.out.println();
		System.out.println("점수: " + score);
		
		result = score > 100 || score < 0 ? "계산불가" 
				: score > 89 ? "A학점" 
				: score > 79 ? "B학점" 
				: score > 69 ? "C학점" 
				: score > 59 ? "D학점" : "F학점";
				
		System.out.println("학점: " + result);
				
					
		
		
	}

}
