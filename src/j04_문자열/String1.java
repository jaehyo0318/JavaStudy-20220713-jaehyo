package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("\"\t안녕\b하세요.\"");
		System.out.println();
		
		String address = "부산시 동래구 명륜동";
		int index = address.indexOf("동");
		int index2 = address.lastIndexOf("동");
		System.out.println(index);
		System.out.println(index2);
		System.out.println();
		
		String subAddress = address.substring(0, 3);
		String subAddress2 = address.substring(1, 6);
		System.out.println(subAddress);
		System.out.println(subAddress2);
		
		//문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int id = address.indexOf("동");
		int id2 = address.lastIndexOf("동");
		
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subId = address.substring(id); 
		String subId2 = address.substring(address.indexOf("동")); 
		String subId3 = address.substring(id, id2 + 1); 
		System.out.println(subId);
		System.out.println(subId2);
		System.out.println(subId3);
		
		// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-'); // 문자
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-"); // 문자열
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1916, 010/8803/2829";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		System.out.println();
	
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);
		
	}

}
