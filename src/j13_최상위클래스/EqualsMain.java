package j13_최상위클래스;

public class EqualsMain {
	public static void main(String[] args) {
		Student s1 = new Student(20220001, "서재효");
		Student s2 = new Student(20220001, "서재효");
		Student s3 = new Student(20220002, "서재희");
		Student s4 = new Student(20220002, "서재효");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //주소값 비교
		System.out.println(s1.equals(s3)); //주소값 비교
		System.out.println(s3.equals(s4)); //주소값 비교
	
		System.out.println(s1.getClass() == s2.getClass()); // => s1 instanceof Student
		System.out.println(s1 instanceof Student); // X
		System.out.println(s1.getClass() == Student.class); // O, 객체비교
		System.out.println(s2.getClass());
		System.out.println(s3.getClass());
	}
}
