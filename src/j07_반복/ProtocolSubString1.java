package j07_반복;

public class ProtocolSubString1 {

	/*
	 * @ 뒤에 오는 문자열이 명령어
	 * : 뒤에 오는 문자열은 내용
	 */
	
	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:서재효@From:서재호@SendDate:2022/07/21";
		
		while(true) {
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
		
			System.out.println(command + ": " + content);
			
			if(nextCommandIndex == -1) {
				break;
			}
			
			data = data.substring(nextCommandIndex);
		}
		
	}

}
