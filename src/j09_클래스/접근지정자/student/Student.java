package j09_클래스.접근지정자.student;

public class Student {

	private String name;
	private int studentYear;
	private int age;
	private String address;
	private String phone;
	public Student() {}
	
	// private 변수에 값을 주입하는 방법 1
	// [ 생성자를 통한 값 주입 ]
	// 외부의 값을 대신 넣어줌, 은행원 역할
	public Student(String name, int studentYear, int age, String address, String phone) { 
		this.name = name;
		this.studentYear = studentYear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	// private 변수에 값을 주입하는 방법 2
	// [ Setter를 통한 값 주입]
	public void setName(String name) { // 메소드명, set+변수명, 매개변수에 변수명 
		this.name = name;
	}
	
	//private 변수의 값을 가져오는 방법
	public String getName() { // 메소드명, get+변수명, return 값 자료형 => 변수 자료형
		return name;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
