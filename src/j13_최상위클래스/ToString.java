package j13_최상위클래스;

public class ToString {
	
	private int a;
	public ToString(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	private int b;
	@Override
	public String toString() {
		return "ToString [a=" + a + ", b=" + b + "]";
	}
	
//	@Override
//	public String toString() {
//		return "a: " + a + ", b: " + b;
//	}
	
	
}
