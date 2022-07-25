package j11_상속.factory;

public class Factory {
	private int factoryNumber;
	
	public Factory(int factoryNumber) { // 생성자를 만들어서 기본 생성자 사라짐
		this.factoryNumber = factoryNumber;
	}
	
	public void start() {
		System.out.println(factoryNumber + "공장을 가동합니다.");
	}
	
	public void stop() {
		System.out.println(factoryNumber + "공장을 멈춥니다.");
	}
}
