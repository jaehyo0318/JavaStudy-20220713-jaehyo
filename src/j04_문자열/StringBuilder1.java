package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이름: ");
		stringBuilder.append("서재효");
		//버퍼처럼 공간을 만들고 append하면 값이 들어감
		stringBuilder.delete(1, 2);
		
		System.out.println(stringBuilder.toString()); // toString사용해야 함

	}

}
