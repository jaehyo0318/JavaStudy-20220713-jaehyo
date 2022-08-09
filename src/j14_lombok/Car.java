package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
	private String company;
	private String model;
	private String color;
	
//	public Car(String company, int falg) {
//		overloading이 안되기 때문에 falg마다 if처리해야함, 다른사람이 못알아봄
//	}
}
