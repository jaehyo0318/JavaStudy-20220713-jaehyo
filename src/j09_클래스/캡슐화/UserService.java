package j09_클래스.캡슐화;

import java.util.Scanner;

public class UserService {
	
	private User user;
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public User addUser() {
		
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		if(isStrBlank(username)) {
			System.out.println("공백은 입력 불가합니다.");
		}
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		if(isStrBlank(password)) {
			System.out.println("공백은 입력 불가합니다.");
		}
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		if(isStrBlank(name)) {
			System.out.println("공백은 입력 불가합니다.");
		}
		
		System.out.print("이메일: ");
		email = scanner.nextLine();
		if(isStrBlank(email)) {
			System.out.println("공백은 입력 불가합니다.");
		}
		
		return new User(username, password, name, email);
	}
	
	private boolean isStrBlank(String str) {
		return str == null || str.isBlank(); // => str.trim().isEmpty
		//isBlank() => 공백 혹은 빈문자열이 있을경우 true반환
	}
}
