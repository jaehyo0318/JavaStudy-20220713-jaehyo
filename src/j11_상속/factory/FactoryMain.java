package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory[] samsungFactorys = new SamsungFactory[3];
		samsungFactorys[0] = new SamsungFactory(1);
		samsungFactorys[1] = new SamsungFactory(2);
		samsungFactorys[2] = new SamsungFactory(3);
		
		
		LGFactory[] lgFactorys = new LGFactory[3];
		lgFactorys[0] = new LGFactory(1);
		lgFactorys[1] = new LGFactory(2);
		lgFactorys[2] = new LGFactory(3);
		
		
		System.out.println("삼성 공장 가동");
		for(int i = 0; i < samsungFactorys.length; i ++) {
			samsungFactorys[i].start();
		}
		
		System.out.println("삼성 공장 중지");
		for(int i = 0; i < samsungFactorys.length; i ++) {
			samsungFactorys[i].stop();
		}
		System.out.println();

		System.out.println("LG 공장 가동");
		for(int i = 0; i < lgFactorys.length; i ++) {
			lgFactorys[i].start();
		}
		
		System.out.println("LG 공장 중지");
		for(int i = 0; i < lgFactorys.length; i ++) {
			lgFactorys[i].stop();
		}
	}

}
