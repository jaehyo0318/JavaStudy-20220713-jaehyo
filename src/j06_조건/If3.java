package j06_조건;

public class If3 {

	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		String result = null;
		
		if(x == 0 || y == 0) {
			System.out.println("계산 불가");
		}else if(x > 0 && y > 0) {
			result = "1 Quadrant";
		}else if(x < 0 && y > 0) {
			result = "2 Quadrant";
		}else if(x < 0 && y < 0) {
			result = "3 Quadrant";
		}else{
			result = "4 Quadrant";
		}
		
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("result: " + result);
		
		
	}

}
