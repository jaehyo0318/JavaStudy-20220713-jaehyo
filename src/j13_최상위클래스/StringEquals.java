package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
		
		String name1 = "서재효"; //리터럴 상수 주소
		String name2 = "서재효"; //리터럴 상수 주소
		String name3 = new String("서재효"); //새로 주소를 할당받고 리터럴 상수 주소를 넣음
		String name4 = name3;
		
		System.out.println("name1: " + name1);
		System.out.println("name2: " + name2);
		System.out.println("name3: " + name3);
		
		System.out.println();
		
		System.out.println("name1 == name2: " + (name1 == name2));
		System.out.println("name1 == name3: " + (name1 == name3));
		System.out.println("name3 == name4: " + (name3 == name4));
		
		System.out.println();
		
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		System.out.println("name1.equals(name3): " + name1.equals(name3));
		System.out.println("name3.equals(name4): " + name3.equals(name4));
	}

}
