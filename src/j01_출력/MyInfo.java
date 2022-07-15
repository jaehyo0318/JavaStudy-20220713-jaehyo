package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '서'; // char의 기본 형태 => /u0000
		char name2 = '재';
		char name3 = '효';
		
		int age = 25;
		
		String address = "부산 동래구 명륜동";
		
		System.out.println("결과: " + 10 + 20); 
		// 문자열 10과 20이 더해져서 1020나옴
		// 결과: 30이 나올려면 -> ("결과" + (10 + 20))
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		// "" + 안붙이면 숫자나옴(유니코드 숫자를 더해서)
		// name1 + name2 + name3는 +기호 때문에 숫자로 인식
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();


		System.out.print("이름: ");
		System.out.println("서재효");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 동래구 명륜동");
		System.out.println();
	}

}
