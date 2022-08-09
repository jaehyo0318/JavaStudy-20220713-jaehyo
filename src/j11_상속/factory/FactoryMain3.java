package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		//업캐스팅
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		SamsungFactory sfactory = new SamsungFactory(1);
		
		System.out.println(((Factory)sfactory));
		Factory f = sfactory;
		System.out.println(f);
		
		SamsungFactory sf = (SamsungFactory) f;
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = (SamsungFactory)factory;
	}

}
