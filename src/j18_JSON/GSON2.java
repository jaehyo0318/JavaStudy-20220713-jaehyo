package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON2 {
	
	public static void main(String[] args) {
		User user = UserService.createUser();
		Gson gson = new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.serializeNulls()// serializeNulls() -> null값도 표기
				.setPrettyPrinting()
				.create();
		// 자료형 앞에 transient를 적으면 gson에서 안보임, map에서도 null로 나옴 
		
		// 객체를 JSON으로 변환 -> toJson(객체)
		// JSON 문자열이기 때문에 get, set불가
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		System.out.println();
		
		// JSON을 객체로 변환 -> fromJson(json문자열, 변환 할 객체 클래스)
		User userObj = gson.fromJson(userJson, User.class);
		
		System.out.println(userObj);
		System.out.println(userObj.getAddress());

	}

}
