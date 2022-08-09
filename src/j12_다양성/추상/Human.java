package j12_다양성.추상;

// 부모 클래스가 추상 클래스이기 때문에
// 오버라이드 하지 않으면 에러가 남
// 자식 클래스도 추상클래스로 만들거나 
// 부모클래스의 추상메소드를 오버라이드 해야함
public class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
