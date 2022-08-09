package j13_최상위클래스;

import java.util.Objects;

public class Student {
	private int studentCode;
	private String name;
	
	
	
	public Student(int studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
	}

	public void addStudents(int studentCode, String name) {
		System.out.println("학생을 추가합니다.");
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode, name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Student student = (Student) obj;
//		
//		boolean result = studentCode == student.studentCode
//				&& Objects.equals(name, student.name); // => && name.equals(student.name)
//				// 주소가 아니라 주소안의 값들이 같은지 비교
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // 자신과 obj가 주소가 같으면 true
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentCode == other.studentCode;
	}
	
	
}
