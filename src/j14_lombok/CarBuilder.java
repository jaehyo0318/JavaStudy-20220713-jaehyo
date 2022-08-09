package j14_lombok;

public abstract class CarBuilder {
	protected Car car;
	
	public Car build() {
		return car;
	}
	
	public CarBuilder builder() {
		car = new Car();
		return this; //자기 자신을 리턴, CarBuilder리턴
	}
	
	public abstract CarBuilder company(String company);
	public abstract CarBuilder model(String model);
	public abstract CarBuilder color(String color);
}
