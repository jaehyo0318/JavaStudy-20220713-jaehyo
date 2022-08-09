package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
	
		// studentList
		// Student 배열을 생성하고 그 배열을 리스트로 변환후에
		// 새로운 ArrayList를 생성하여 전체를 추가
		Student[] students = {student1, student2, student3, student4, student5};
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.addAll(Arrays.asList(students));
		
		System.out.println(studentList);
		for(Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("-----서재효 삭제-----");
		/*
		 *  학생 이름이 서재효인 객체를 찾아서 
		 *  출력하고 삭제하기
		 */
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals("서재효")) {
			 System.out.println(studentList.get(i));
			 studentList.remove(i);
			}
		}
		/*
		 * foreach
		 * for(Student student : studentList) {
		 *		if(student.getName.equals("서재효")){
		 *  	System.out.println(student);
		 *		studentList.remove(student);
		 *		break;
		 *		}
		 */
		System.out.println(studentList);
		
		
		
	
	}

}
