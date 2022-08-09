package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		Map<String, String> todoMap1 = new HashMap<String, String>();
		todoMap1.put("name", "bulbasaur");
		todoMap1.put("url", "http://pokeapi.co/api/v2/pokemon1/1/");

		Map<String, String> todoMap2 = new HashMap<String, String>();
		todoMap2.put("name", "ivysaur");
		todoMap2.put("url", "http://pokeapi.co/api/v2/pokemon1/2/");
		
		Map<String, String> todoMap3 = new HashMap<String, String>();
		todoMap3.put("name", "venusaur");
		todoMap3.put("url", "http://pokeapi.co/api/v2/pokemon1/3/");
		
		list.add(todoMap1);
		list.add(todoMap2);
		list.add(todoMap3);
		
		dataMap.put("count", 1118);
		dataMap.put("next", "http://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		dataMap.put("previous", null);
		dataMap.put("result", list);
		
		System.out.println(dataMap);
		
	}

}
