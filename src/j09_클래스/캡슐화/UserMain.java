package j09_클래스.캡슐화;

public class UserMain {
	public static void main(String[] args) {
		User user = new User();
		UserService service = new UserService();
	
		service.addUser();
		System.out.println(service);
		System.out.println(user.getUsername());
		System.out.println(user.getName());
	}
}
