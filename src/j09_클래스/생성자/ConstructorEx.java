package j09_클래스.생성자;

public class ConstructorEx {
	
	String name;
	int age;
	
	// Args -> Arguments(인수, 매개변수)
	//NoArgsConstructor
	public ConstructorEx() {
		System.out.println("기본 생성자");
	}

	//Required(필수)
	//RequiredArgsConstructor
	public ConstructorEx(String name) { // name이라는 변수가 필수
		System.out.println("매개변수: " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name; //this. => 나 자신의 주소를 말함 
	}

	//RequiredArgsConstructor
	public ConstructorEx(int age) { // age이라는 변수가 필수
		System.out.println("매개변수: " + age);
		System.out.println("age를 매개변수로 받는 생성자");
	}

	//AllArgsConstructor
	public ConstructorEx(String name, int age) {
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + age);
		System.out.println("전체 생성자");
	}
}
