package j13_최상위클래스;

import java.util.Objects;

public class HashCodeMain {

	public static void main(String[] args) {
		Student student1 = new Student(20220001, "서재효");
		Student student2 = new Student(20220001, "서재효");
		Student student3 = new Student(20220002, "서재효");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		// hashCode(), 해당객체의 값이 같으면 주소를 값게해줌

		
		System.out.println(student1.hashCode() == student2.hashCode());
		System.out.println(Objects.hash(20220001, "서재효"));
	}

}
