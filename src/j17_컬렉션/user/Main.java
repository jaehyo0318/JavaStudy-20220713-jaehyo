package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 *  Map안에 리스트 안에 Map을 저장하는 구조
		 */
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); 
				
		Map<String, Object> todoMap1 = new HashMap<String, Object>();
		todoMap1.put("todocode", 182);
		todoMap1.put("todo", "스프링 부트 서버 테스트_182");
		todoMap1.put("todoComplete", true);
		todoMap1.put("importance", false);
		todoMap1.put("totalCount", 157);
		
		Map<String, Object> todoMap2 = new HashMap<String, Object>();
		todoMap2.put("todocode", 181);
		todoMap2.put("todo", "스프링 부트 서버 테스트_181");
		todoMap2.put("todoComplete", true);
		todoMap2.put("importance", false);
		todoMap2.put("totalCount", 157);
		
		list.add(todoMap1);
		list.add(todoMap2);
		
		dataMap.put("code", 1);
		dataMap.put("message", "1page list success to load");
		dataMap.put("data", list);
		
		
		System.out.println(dataMap);
	}
}
