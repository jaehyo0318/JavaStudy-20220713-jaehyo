package j18_JSON;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON1 {

	public static void main(String[] args) {
		// Gson 객체 생성하는 방법
		
		// 1. Gson() 생성자를 통해 생성, PrettyPrinting없음
		Gson gson1 = new Gson();
		
		// 2. GsonBuilder() 생성자를 통해 생성
		Gson gson2 = new GsonBuilder().create();
		
		// 3. JSON 이쁘게 출력
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		Map<String, String>  map = new HashMap<String, String>();
		map.put("username", "jaehyo");
		map.put("password", "1234");
		map.put("name", "서재효");
		map.put("email", "wogy2829@naver.com");
		
		String json1 = gson3.toJson(map);
		String json2 = gson2.toJson(map);
		
		System.out.println(gson1.toString());
		System.out.println(json1);
		System.out.println(json2);

	}

}
