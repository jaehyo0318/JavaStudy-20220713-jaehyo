package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {

	public static void main(String[] args) {
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();

		strMap.put(1, "java1");
		strMap.put(1, "java2");
		strMap.put(1, "java3");
		strMap.put(1, "java4");
		// Key값이 중복될 수 없다.

		System.out.println(strMap);
		
		strMap2.put("a", "python");
		strMap2.put("b", "python");
		strMap2.put("c", "python");
		strMap2.put("d", "python");
		// value값은 중복된다.
		
		System.out.println(strMap2);
	
		//get에 키값을 넣어야함
		System.out.println(strMap2.get("a"));

		// 키값을 Iterator에 넣어서 반복문 돌려야함
		Iterator<String> irKey = strMap2.keySet().iterator(); // keySet()은 set을 return
		while(irKey.hasNext()) {
			System.out.println(irKey.next()); 
		}
		System.out.println();
		
		strMap2.entrySet().forEach(arg -> {
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});
		
	}

}
