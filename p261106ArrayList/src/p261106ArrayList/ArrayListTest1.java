package p261106ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// String을 원소로 가지는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("MILK");
		list.add("BREAD");
		
		
		System.out.println("1 : " + list);
		list.add("BUTTER");
		System.out.println("2 : " + list);
		// index 1에 APPLE 추가
		list.add(1, "APPLE");
		System.out.println("3 : " + list);
		// index 2를 GRAPE로 대체
		list.set(2, "GRAPE");
		System.out.println("4 : " + list);
		// index 1의 요소를 삭제
		list.remove(1);
		System.out.println("5 : " + list);
		
		list.add("GRAPE");
		
		// index 1의 요소의 값을 가져와서 변수에 저장
		String s = list.get(1);
		System.out.println(" ");
		System.out.println(s);
		
		
		
		// 모든 원소의 값을 출력하시오 for-each문을 사용
		for(String abc : list) {
			System.out.println(abc);
		}
		
		
		System.out.println(list.size());
		System.out.println(list.indexOf("GRAPE"));
		System.out.println(list.lastIndexOf("GRAPE"));
		
		
		
		System.out.println("***** iterator *****");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext() ) { // 열거할 원소가 있는지 검사
			// 원소를 가져온다.
			String a = iterator.next();
			System.out.println(a);
		}
//		이방식은 리스트를 새로 만들어서 하는거
//		ArrayList<String> listA = new ArrayList<>();
//		for(String abcd : list) {
//			listA.add(abcd.toLowerCase());
//		}
//		이 방식은 리스트에 내용을 바꾼거 새로만든거아님
		int n =0;
		for(String i:list) {
			list.set(n, i.toLowerCase());
			n++;
		}
//		System.out.println(listA);
		System.out.println(list);
		
		System.out.println("***** iterator *****");
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext() ) { // 열거할 원소가 있는지 검사
			// 원소를 가져온다.
			String a = iterator2.next();
			System.out.println(a.toLowerCase());
		}
		
	}

	private static char[] toLowerCase() {
		// TODO Auto-generated method stub
		return null;
	}

}







