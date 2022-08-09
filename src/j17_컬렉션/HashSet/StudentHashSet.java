package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {

		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		Student[] students = {student1, student2, student3, student4, student5};
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.addAll(Arrays.asList(students));
		
		System.out.println(studentSet);
		
		Iterator<Student> ir = studentSet.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			if(student.getName().equals("서재효")) {
				System.out.println(student);
				studentSet.remove(student);
				break; // 다음으로 가는 기준이 사라지기 때문에 break걸어줘야함
			}
		}
		for(Student student : studentSet) {
			if(student.getName().equals("전나경")) {
				System.out.println(student);
				studentSet.remove(student);
				break;
			}
		}
		
		System.out.println(studentSet);
		
	

	}

}
