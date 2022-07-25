package j11_상속;

public class Human extends Animal {
	public Human() {
		super(); // 생략돼 있음, 부모 객체의 주소, 부모의 주소의 생성자를 호출
		// 부모의 주소를 생성하는 것, Tiger의 super(); 부모 주소와 다름
		System.out.println("Human 객체 생성");
		// super();가 밑으로 갈 수 없음
		// => 부모 객체가 먼저 생성되고 자식 객체가 생성될 수 있기 때문
	}
	
	@Override // 오버라이드: 재정의, @ -> 어노테이션
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
