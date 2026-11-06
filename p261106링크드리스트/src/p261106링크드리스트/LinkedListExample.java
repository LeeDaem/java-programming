package p261106링크드리스트;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// LinkedList 객체 생성
		LinkedList<String> list = new LinkedList<>();
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add("APPLE");
		System.out.println("1 : " + list);
		
		//
		list.addFirst("ORANGE");
		System.out.println("2 : " + list);
		// 맨앞의 원소를 삭제
		list.removeFirst();
		System.out.println("3 : " + list);
		// 맨뒤의 원소를 삭제
		list.removeLast();
		System.out.println("4 : " + list);
		list = list.reversed(); // 원소들의 순서들을 바꿈
		System.out.println("5 : " + list);
		list.push(null);
	}

}
