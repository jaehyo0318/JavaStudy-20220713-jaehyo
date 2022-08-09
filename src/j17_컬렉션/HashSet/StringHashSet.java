package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("python");
		set.add("1");
		set.add("2");
	
		System.out.println(set);
		Iterator<String> ir =  set.iterator(); // 한줄로 세움
		// hasNext(): 다음이 있나, 없나
		// next(): 다음의 값을 불러옴, hasNext없어도 가능
		// 값 조회
		while(ir.hasNext()) {
			String str = ir.next(); // ir.next()는 while에서 한번만 가져와야함
			if(str.equals("java")) { // ir.next().equals("java") => "java" 다음걸 가져옴
				System.out.println(str);				
			}
		}
		
	}

}
