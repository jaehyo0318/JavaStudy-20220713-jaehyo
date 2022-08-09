package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()
				.company("기아")
				.model("K5")
				.color("흰색") // .을 찍을려면 계속 주소를 return하게 해줘야함
				.build();
								
		
		System.out.println(car);
			
	}

}
