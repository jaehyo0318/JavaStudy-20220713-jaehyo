package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		String address = "부산 동래구 명륜동 충렬대로";
		String tempAddress = null;
		
		for(int i = 0; i < address.length(); i++) {
			String subAddress = address.substring(i, i + 1);
			if(subAddress.equals(" ")) {
				continue;
			}
			if(i == 0) {
				tempAddress = subAddress;
			}else {
				tempAddress += subAddress;				
			}
		}
			
		System.out.print(tempAddress);
		

	}

}
