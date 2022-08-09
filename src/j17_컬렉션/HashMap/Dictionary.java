package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import j17_컬렉션.ArrayList.User;

public class Dictionary {

	public static void main(String[] args) {
		Map<String, String> dict = new HashMap<String, String>();

		Map<String, User> userDict = new HashMap<String, User>();
		String username = "jaehyo";
		userDict.put(username, User.builder().username(username).password("1111").name("재효").email("aaa@naver.com").build());
		
		if(userDict.containsKey("jaehyo")) {
			System.out.println(userDict.get(username));
			System.out.println();
		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		String searchText = null;
		
		dict.put("축구", "soccer");
		dict.put("야구", "baseball");
		dict.put("농구", "basketball");
		dict.put("골프", "golf");
		
		while(true) {
			
			System.out.println("[사전 검색 기능]");
			System.out.println("# 프로그램 종료명령(exit)");

			System.out.print("검색어: ");
			searchText = scanner.nextLine();
			System.out.println();
			if(searchText.equals("exit")) {
				System.out.println("사전 검색 종료.");
				break;
			}else if(dict.containsKey(searchText)) {
				System.out.println(searchText + " -> " + dict.get(searchText));
			}else {
				System.out.println("잘못된 검색어입니다.");
			}
			System.out.println();
		}
		
		/*
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 */
		
		
	}

}
