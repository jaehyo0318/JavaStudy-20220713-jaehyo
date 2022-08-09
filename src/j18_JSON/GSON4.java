package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GSON4 {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "서재효");
		jsonObject.addProperty("age", 25);
		jsonObject.addProperty("address", "부산 동래구 명륜동");
		jsonObject.addProperty("phone", "010-8803-2829");
		
		String json = gson.toJson(jsonObject);
		System.out.println(json);
		System.out.println();
		
		System.out.println(jsonObject);
		
		JsonObject jsonObj = gson.fromJson(jsonObject, JsonObject.class);
		
		System.out.println(jsonObj);
	}

}
