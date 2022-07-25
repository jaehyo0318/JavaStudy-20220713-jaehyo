package j10_배열.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {

	public static void main(String[] args) {
		/*
		 *  Arrays 클래스 사용법
		 *   => 배열을 관리해주는 객체
		 *   
		 *   1. 배열의 내용을 검색후 인덱스를 반환받는 방법
		 *   => binarySearch(찾고자 하는 값)
		 *   
		 *   2. 배열을 복사할 때 사용하는 메소드
		 *   => copyOf(복사하고자 하는 배열, 새로 생성할 배열의 크기)
		 *   => 배열의 크기가 복사하는 배열보다 작을 경우 0번 인덱스에서 해당 크기의 인덱스 까지 복사
		 *   => 배열의 크기가 복사하는 배열보다 큰경우 남은 곳에 0이 들어감
		 *   
		 *   3. 배열을 복사할 때 원하는 범위만 복사해주는 메소드
		 *   => copyOfRange(복사하고자 하는 배열, 시작 인데스, 마지막 인덱스)
		 *   
		 *   4. 배열을 초기화하고 원하는 값으로 모두 채우는 메소드
		 *   => fill(초기화 하고자 하는 배열, 채울 값)
		 *   
		 *   5. 배열을 정렬하는 방법
		 *   => sort(정렬하고자 하는 배열)
		 */
		
		int[] numbers = { 1, 9, 6, 3, 5, 7, 2, 4, 8 };
		
		//얕은 복사
		int[] numbers2 = numbers;
		
		printArray(numbers);
		printArray(numbers2);
		
		//깊은 복사
		int[] numbers3 = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers3[i] = numbers[i];
		}
		printArray(numbers3);
		
		System.out.println();
		
		numbers[8] = 10;
		
		printArray(numbers);
		printArray(numbers2);
		printArray(numbers3);
		System.out.println();
		
		//깊은 복사
		int[] numbers4 = Arrays.copyOf(numbers, numbers.length + 5);
		printArray(numbers4);
		int[] numbers5 = Arrays.copyOfRange(numbers, 2, 7);
		printArray(numbers5);
		
		//오름차순
		Arrays.sort(numbers3);
		printArray(numbers3);
		System.out.println();
		
		//내림차순, Collections를 쓰려면 int가 아닌 Integer자료형을 써야함
		Integer[] numArray = { 1, 2, 3, 4, 5 };
		Arrays.sort(numArray, Collections.reverseOrder());
		printArray(numArray);
		System.out.println();
		
		//배열 초기화 후 채우기
		Arrays.fill(numbers5, 10);
		printArray(numbers5);
		System.out.println();
		
		//값의 위치 찾기, sort()로 정열후에 찾아줘야함
		Arrays.sort(numbers);
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println("찾은 인덱스: " + index);
	
	
	}

	
	
	public static void printArray(int[] arr) {
		
		System.out.print("Array: [ ");	
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
	
public static void printArray(Integer[] arr) {
		
		System.out.print("Array: [ ");	
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
}
