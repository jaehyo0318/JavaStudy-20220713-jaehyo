package j19_익명클래스.role;

public class PrincipleMain {

	public static void main(String[] args) {
		User user = User.builder()
				.username("jaehyo")
				.password("1111")
				.roles("ROLE_USER,ROLE_ADMIN,ROLE_MANAGER")
				.build();
		
		User user2 = User.builder()
				.username("jaehyo")
				.password("1111")
				.roles("ROLE_USER")
				.build();
		
		PrincipleDetailes princuiDetailes = new PrincipleDetailes(user);
		PrincipleDetailes princuiDetailes2 = new PrincipleDetailes(user2);
		
		printPrincipleData(princuiDetailes);
		printPrincipleData(princuiDetailes2);

	}

		public static void printPrincipleData(PrincipleDetailes principleDetailes) {
			System.out.println("[ principla 정보 출력]");
			
			System.out.println("username: " + principleDetailes.getUsername());
			System.out.println("password: " + principleDetailes.getPassword());

			for(GrantedAuthority grantedAuthority : principleDetailes.getAuthorities()) {
				System.out.println("권한: " + grantedAuthority.getAuthority());
			}
		}
}
