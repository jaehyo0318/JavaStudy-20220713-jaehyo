package j16_제네릭;

import j14_lombok.Car;

public class CMRespMain {
	public static void main(String[] args) {
		// 자동차 한대를 생성해줘
		Car car = Car.builder()
				.company("현대")
				.model("아반떼")
				.color("화이트")
				.build();
		
		CMRespDto<Car> cmRespDto = new CMRespDto<Car>(1, "차량 생산 완료", car);
		System.out.println("응답결과: " + cmRespDto);
		
		//해당 차량이 현대자동차인지 확인해줘
		CMRespDto<?> cmRespDto2 = null;
		
		if(car.getCompany().equals("KIA")) {
			cmRespDto2 = new CMRespDto<Car>(1, "현대자동차 맞음", car);
		}else {
			cmRespDto2 = new CMRespDto<Boolean>(-1, "현대자동차 아님", false);
			
		}
		
		System.out.println("응답결과: " + cmRespDto2);
				
	}
	
	
}
