package j21_기본자료형_형변환;

public class ConvertMain {

	public static void main(String[] args) {
		String num1 = "10"; //참조자료형
		int num2 = 20; //일반자료형
		
		System.out.println(Integer.parseInt(num1) + num2);
	
		String dNum1 = "3.14";
		double dNum2 = 1.2;
		System.out.println(Double.parseDouble(dNum1) + dNum2);
		
		String flag = "true";
		boolean flag2 = Boolean.parseBoolean(flag);
		System.out.println(Boolean.toString(!flag2));
		
		
		
	}

}
