package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Product product = new Product();
		
		product = builder.builder()
				.productCode(1)
				.productName("스타벅스 텀블러")
				.productCategory("텀블러")
				.createDate("2022-08-02")
				.build();
		System.out.println(product);
	}
}
