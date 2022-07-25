package j07_반복;

public class For4 {

	public static void main(String[] args) {
		
		String address = "부산 동래구 명륜동 충렬대로";
		
		for(int i = 0; i < address.length(); i++) {
			String subStr = address.substring(i, i + 1);
			
			if(subStr.equals(" ")) { // " " 와 같으면 true 아니면 false
				int index = 0;
				String temp = address.substring(0, i);
			
				if(temp.contains(" ")) { // " "가 포함돼 있는지 아닌지
					index = temp.lastIndexOf(" ") + 1;
					System.out.println(temp.substring(index, i));
				}else {
					System.out.println(temp.substring(0, i));
				}
			}
			if(i == address.length() - 1) {
				System.out.println(address.substring(address.lastIndexOf(" ") + 1));
			}
		}
	}
}
