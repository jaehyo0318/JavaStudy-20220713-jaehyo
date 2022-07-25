package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * ...
		 * k
		 */
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
		}
	}

}
