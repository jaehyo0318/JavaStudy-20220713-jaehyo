package j09_클래스.생성자;

public class ConstructorExMain {
	
	public static void main(String[] args) {
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("서재효");
		ConstructorEx constructorEx3 = new ConstructorEx(25);
		ConstructorEx constructorEx4 = new ConstructorEx("서재효", 25);
		
		System.out.println(constructorEx2.name);
	}
}
