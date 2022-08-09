package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserArrayList2 {
	private Scanner scanner;
	private ArrayList<User> arrayList;
	
	public UserArrayList2() {
		arrayList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void menu() {
		UserArrayList2 arrayList2 = new UserArrayList2();
		
		String select = null;
		
		
		
		while(true) {
			System.out.println("[MENU]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 목록");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			System.out.print("선택 >> ");
			select = scanner.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				arrayList2.addUser();
				System.out.println();
			}else if(select.equals("2")) {
				arrayList2.showUserList();
				System.out.println();
			}else if(select.equals("3")) {
				arrayList2.removeUser();
				System.out.println();
			}else if(select.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 번호입니다.");
			}
		}
		
	}
	
	public void addUser() {
		UserArrayList2 arrayList2 = new UserArrayList2();
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("[사용자 추가]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		
		
		if(arrayList2.sameUsername(username)) {
			System.out.println(arrayList2.sameUsername(username));
			System.out.print("비밀번호: ");
			password = scanner.nextLine();
			System.out.print("이름: ");
			name = scanner.nextLine();
			System.out.print("이메일: ");
			email = scanner.nextLine();
		
		
		
			User user = User.builder()
					.password(password)
					.name(name)
					.email(email)
					.build();
		
			arrayList.add(user);
		}
	}
	
	public void showUserList() {
		System.out.println("[사용자 목록]");
		for(User user : arrayList) {
			System.out.println("아이디\t>>" + user.getName());
			System.out.println("비밀번호>>" + user.getPassword());
			System.out.println("이름\t>>" + user.getName());
			System.out.println("이메일\t>>" + user.getEmail());
			System.out.println();
			
		}
	}
	
	public void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("[사용자 삭제]");

		for(User user : arrayList) {
			
			System.out.print("아이디: ");
			username = scanner.nextLine();
			if(user.getUsername().equals(username)) {
				System.out.print("비밀번호: ");
				password = scanner.nextLine();
				
				if(user.getPassword().equals(password)) {
					System.out.println(user.getUsername() +"를 삭제합니다.");
					arrayList.remove(user);
					return;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			}
			System.out.println("해당 아이디는 존재하지 않습니다.");
			
		}
		
	}
	
	private boolean sameUsername(String a) {
		if(arrayList != null) {
			for(User user : arrayList) {
				if(user.getUsername().equals(a)) {
					System.out.println("해당 아이디는 존재합니다.");
					return false;
				}
			
			}
		}
		return true;
	}
	

}
