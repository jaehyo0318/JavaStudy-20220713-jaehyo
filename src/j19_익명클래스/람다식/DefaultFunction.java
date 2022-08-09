package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultFunction {

	public static void main(String[] args) {
		System.out.println("-----Runnable-----");
		Runnable runnable = () -> {//main에서만 만들어씀 
			System.out.println("runnable인터페이스를 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문을 작성 할 수 있음");
		};

		runnable.run();
		
		System.out.println("\n-----Supplier-----");
		Supplier<Integer> supplier = () -> 100;
		Supplier<Integer> supplier2 = () -> {
			System.out.println("다른 실행문도 작성 가능");
			return 200;
		};
		System.out.println(supplier.get());
		System.out.println(supplier2.get());
	
		System.out.println("\n-----Consumer-----");
		Consumer<String> consumer = (name) -> {
			System.out.println("이름: " + name);
		};
	
		consumer.accept("서재효");
	
		System.out.println("\n-----Function-----");
		Function<Integer, Integer> function = (num) -> num * num;
		System.out.println(function.apply(10));
		
		System.out.println("\n-----Predicate-----");
		Predicate<String> predicate = (str) -> str == null || str.isBlank();
		System.out.println(predicate.test(" "));
		System.out.println(predicate.test(null));
	
		System.out.println("\n-----파라미터 두개------");
		
		System.out.println("-----BiConsumer-----");
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {
			System.out.println("num1 + num2 = " + (num1 + num2));
		};
		biConsumer.accept(10, 20);
		
		System.out.println("\n-----매개변수와 반환타입 일치------");
		UnaryOperator<Integer> operator = num -> num * num * num;
		System.out.println(operator.apply(2));
		
		BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;
		System.out.println(binaryOperator.apply(10, 2));
	
	}
	

}
