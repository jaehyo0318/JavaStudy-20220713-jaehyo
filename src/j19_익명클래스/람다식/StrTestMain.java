package j19_익명클래스.람다식;

import java.util.function.Consumer;
import java.util.function.Function;

public class StrTestMain {

	public static void main(String[] args) {
		StrTest name = (str) -> str + "님";
		System.out.println(name.test("서재효"));

		
		StrTest strGread = (score) -> {
			if(score.equals("90")) {
				return "A";
			}else if(score.equals("80")) {
				return "B";
			}else {
				return "F";
			}
		};
		String gread = strGread.test("80");
		System.out.println(gread);
		
		Consumer<String> consumer = data -> {System.out.println("data: " + data);};
		
		consumer.accept("서재효");
		consumer.andThen(consumer).accept("서재희");
	
		
		Function<Integer, String> f = (num) -> Integer.toString(num);
		System.out.println(f.apply(100));
	}

}
