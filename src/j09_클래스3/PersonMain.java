package j09_클래스3;

public class PersonMain {
	public static void main(String[] args) {
		Student student1 = new Student("서재효", 25, "동아대학교", 1715637, 4);
		
		System.out.println(student1.toString());
		System.out.println(student1.mealTime());
	}
}
