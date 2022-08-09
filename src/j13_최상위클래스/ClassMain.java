package j13_최상위클래스;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassMain {

	public static void main(String[] args) {
		Student student = new Student(20220001, "서재효");
		
		Class c = student.getClass();
		
		Class c2 = Student.class;

		System.out.println("클래스명(모든 경로 포함): " + c.getClass());
		System.out.println("클래스명(클래스 명만): " + c.getSimpleName());
		
		//클래스 메소드 관리
		Method[] methods =  c.getMethods();
		
		System.out.println(methods[0].getName());
		for(int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			
			System.out.println(m.getName());
			
			// parameter -> 매개변수
			Parameter[] parameters =  m.getParameters();
			for(int j = 0; j < parameters.length; j++) {
				System.out.println("\t" + parameters[j].getType());
			}
		}
	}

}
