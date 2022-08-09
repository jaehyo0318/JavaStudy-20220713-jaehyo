package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

//@NoArgsConstructor
@RequiredArgsConstructor // final 상수, NonNull쓸때 필요함, 있으면 기본생성자 없음
//@AllArgsConstructor

public class User {
	
	
	private final String email;
	private String name;
	@NonNull
	private String username;
	@NonNull //생성할 때 값이 무조건 들어가야함
	private String password;
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}

	
}
