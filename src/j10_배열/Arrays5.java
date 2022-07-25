package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Arrays5 {
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("==========================");
		
		// 생산만 해주면 주소값이 안들어 있음
		Student[] students = new Student[5];
		students[0] = new Student();
		students[0].setName("서재효");
		System.out.println(students[0].getName());
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		// 객체를 생성해주면 주소가 생김
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		
		int num = 0;
		
		Student student = null;
	}
}
