package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrincipleDetailes {
	
	@NonNull
	private User user;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
//		List<String> roleList = user.getRolesList();
//		
//		for(String role : roleList) {
//			GrantedAuthority grantedAuthority = new GrantedAuthority() {
//				
//				@Override
//				public String getAuthority() {
//					return role;
//				}
//			};
//			authorities.add(grantedAuthority);
//		}
//		String role = ((List<GrantedAuthority>)authorities).get(0).getAuthority();
		
		user.getRolesList().forEach(r -> {
			authorities.add(() -> r);
		});
		return authorities;
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	public String getPassword() {
		return user.getPassword();
	}

}
