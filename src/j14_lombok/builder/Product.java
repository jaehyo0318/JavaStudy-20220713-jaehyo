package j14_lombok.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
	
	private int productCode;
	private String productName;
	private String productCategory;
	private String createDate;
	
	public static Product builder() {
		return new Product();
	}
	
	public Product build() {
		return this;
	}
	
	public Product productCode(int productCode) {
		this.productCode = productCode;
		return this;
	}
	public Product productName(String productName) {
		this.productName = productName;
		return this;
	}
	public Product productCategory(String productCategory) {
		this.productCategory = productCategory;
		return this;
	}
	public Product createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	
}
