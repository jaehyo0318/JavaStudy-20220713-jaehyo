package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	
	public static User createUser() {
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구", "농구", "야구", "골프"}));
		
		User user = User.builder()
				.userCode(1)
				.username(null)
				.password("1111")
				.name("서재효")
				.email("wogy2829@naver.com")
				.address("부산 동래구 명륜동")
				.phone("010-8803-2829")
				.hobby(hobby)
				.build();
		return user;
	}
}
