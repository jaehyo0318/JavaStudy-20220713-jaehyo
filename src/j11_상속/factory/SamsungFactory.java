package j11_상속.factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int factoryNumber) {
		super(factoryNumber); // 부모클래스 생성자 상속
	}
	
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("삼성 ");
		super.stop();
	}
	
	public void produceSamrtPhone() {
		System.out.println("삼성 스마트폰을 생산합니다.");
	}

	

}
