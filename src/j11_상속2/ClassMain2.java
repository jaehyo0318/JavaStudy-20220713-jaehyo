package j11_상속2;

public class ClassMain2 {

	public static void main(String[] args) {
		((ClassA) new ClassB()).showData();
		
		ClassB bb = new ClassB();
		ClassA aa = bb;
		ClassA aaa= new ClassB();
		
		((ClassA) bb).showData();
		((ClassA) bb).printInfo();
		
		aa.showData();
		aa.printInfo();

	}

}
