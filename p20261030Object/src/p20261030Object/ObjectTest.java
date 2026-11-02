package p20261030Object;

import java.util.StringTokenizer;

class Circle {
	
	int radius;
	// 생성자 (int)

	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle(r=" + radius + ")";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Circle objCircle = (Circle)obj;
		if (this.radius == objCircle.radius) {
			return true;
		}else {
			return false;
		}
	}

//	public boolean equals(Circle obj) {
//		if (this.radius == obj.radius) {
//		return true;
//		}else {
//			return false;
//		}
//		
//	}
	

	
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle(10);
		System.out.println(obj1.getClass().getName());
		System.out.println("해시코드는 = " + obj1.hashCode());
		System.out.println("toString = " + obj1.toString());
		Circle obj2 = new Circle(10);
		
		if(obj1.equals(obj2)) {
			System.out.println("2개의 객체는 같은 반지름을 가지는 객체입니다.");
		}else {
			System.out.println("2개의 객체는 다른 반지름을 가지는 객체입니다.");
		}
		
		if(obj1 == obj2) {
			System.out.println("2개의 객체는 같은 객체입니다.");
		}else {
			System.out.println("서로 다른 객체입니다.");
		}
		
		
//		Integer obj = new Integer(100);
		Integer obj = Integer.valueOf(100);
		
		// 오토박싱
		int is = 100;
		Integer objInt = is;
		// 언박싱
		int k = objInt;
		System.out.println(k);
		
		int data = Integer.parseInt("123");
		System.out.println(objInt);
		System.out.println("2진수 : " + objInt.toBinaryString(objInt));
		System.out.println("16진수 : " + Integer.toHexString(objInt));
		
		
		String string1 = "ABCDE";
		String string2 = "BCDEF";
		System.out.println("A의 위치:" + string1.charAt(0));
		System.out.println("A와 B 비교: " + string1.compareTo(string2));
		System.out.println("A와 B 비교: " + string1.toLowerCase());
		System.out.println("A의 위치 : " + string2.indexOf('A'));
		System.out.println("A의 위치 : " + string2.indexOf("BC"));
		
		StringBuffer sb = new StringBuffer("Hello");
		StringTokenizer a = new StringTokenizer("Hello world java", " ");
		int nToken = a.countTokens();
		for(int i = 0; i < nToken; i++) {
			System.out.println(a.nextToken());
		}
	}

}
