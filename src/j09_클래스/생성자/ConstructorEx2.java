package j09_클래스.생성자;

public class ConstructorEx2 {
	
	String name;
	int age;
	
	public ConstructorEx2() {} // Alt + Shift + s, Generate Fields
	
	
	public ConstructorEx2(int age) {
		this.age = age;
	}

	public ConstructorEx2(String name) {
		this.name = name;
	}

	public ConstructorEx2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
