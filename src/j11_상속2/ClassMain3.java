package j11_상속2;

public class ClassMain3 {

	public static void main(String[] args) {
		int num = 10;
		int[] numbers = new int[10];
		numbers[0] = num;
		
		System.out.println(numbers[0]);
		
		ClassA b = new ClassB();
		ClassA[] arrayA = new ClassA[3];
		arrayA[0] = b;
		arrayA[1] = new ClassC();
		
		arrayA[0].printInfo();
		arrayA[1].printInfo();
		
		//NullPointException => null.pirntInfo();
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[i] instanceof ClassB) {
				((ClassB) arrayA[i]).addData();
			}
			if(arrayA[i] instanceof ClassC) {
				((ClassC) arrayA[i]).removeData();
			}
		}

	}

}
