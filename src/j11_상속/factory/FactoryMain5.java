package j11_상속.factory;

public class FactoryMain5 {
	/*
	 * Factory Array 20
	 * 
	 * 배열의 인덱스가 짝수이면 SamsungFactory 생성해서 대입
	 * 배열의 인덱스가 홀수이면 LGFactory 생성해서 대입
	 * 
	 * 삼성공장 1 ~ 10
	 * LG공장 1 ~ 10
	 * 
	 * 
	 * 모든 공장 가동
	 * 
	 * 모든 공장 생산
	 * 
	 * 모든 공장 중지
	 */

	public static void main(String[] args) {
		Factory[] factories = new Factory[20];
		
		for(int i = 0; i < factories.length; i++) {
			if(i % 2 == 0) {
				factories[i] = new SamsungFactory((i / 2) + 1);
			}else {
				factories[i] = new LGFactory((i/2) + 1);
			}
		}
		
		System.out.println("모든 공장을 가동합니다.");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < factories.length; i++) {
			
			factories[i].start();
			
			if(factories[i] instanceof SamsungFactory) {
				((SamsungFactory) factories[i]).produceSamrtPhone();
			}else if(factories[i] instanceof LGFactory) {
				((LGFactory) factories[i]).produceSmartTv();
			}
			
			factories[i].stop();
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("모든 공장이 중지되었습니다.");

	}

}
