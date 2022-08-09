package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserArrayList {

	private List<User> userList;
	private Scanner scanner;
	
	//생성자 호출시 객체 생성
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		//입력
		System.out.println("[사용자 추가]");
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		
		System.out.print("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		userList.add(user);
		
		
	}
	
	public void printUserList() {
		//userList 
		/*
		 * 아이디\t> aaa
		 * 비밀번호\t> 1234
		 * 이름\t> 서재효
		 * 이메일\t> aaa@naver.com
		 */
		System.out.println("[리스트 출력]");
		
		for(int i = 0; i < userList.size(); i++) {
			System.out.println("아이디 \t\t>> " + userList.get(i).getUsername());
			System.out.println("비밀번호\t>> " + userList.get(i).getPassword());
			System.out.println("이름 \t\t>> " + userList.get(i).getName());
			System.out.println("이메일 \t\t>> " + userList.get(i).getEmail());
			System.out.println();
		}
	}
	
	public void removeUser() {
		//아이디 입력
		String username = null;
		String password = null;
		System.out.println("[사용자 삭제]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		for(User checkUsername : userList) {
			if(checkUsername.getUsername().equals(username)) {
				System.out.println("비밀번호를 입력하세요.");
				password = scanner.nextLine();
				if(checkUsername.getPassword().equals(password)) {
					System.out.println(checkUsername.getUsername() + "의 정보를 삭제합니다.");
					userList.remove(checkUsername);
					return;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return; 
					// break면 "해당 사용자를 찾을 수 없습니다."가 계속 출력됨
					// 아예 메소드를 빠져 나가야함
				}	
			
			}
			System.out.println("해당 사용자를 찾을 수 없습니다.");
		}
	}
	
	public void menu() {
		UserArrayList arrayList = new UserArrayList();
		while(true) {
			String select = null;
			
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			select = scanner.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				arrayList.addUser();
				System.out.println();
			}else if(select.equals("2")) {
				arrayList.printUserList();
				System.out.println();
			}else if(select.equals("3")) {
				arrayList.removeUser();
				System.out.println();
			}else if(select.equals("q")) {
				System.out.println("시스템 종료");
				break;
			}else {
				System.out.println("해당 번호는 사용할 수 없습니다.");
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		UserArrayList arrayList = new UserArrayList();
		arrayList.menu();
		
		
	}

}
