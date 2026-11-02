package 객체지향0610정적변수메소드;

class Test {
	int a;
	// 정적 변수
	static int b;
		
	// 인스턴스 메소드
	void sub1() {
		a = 0;
	}
	// 정적 메소드
	static void sub2() {
		// 정적 메소드에서는 인스턴스 필드를 사용할 수 없다.
		// 오직 정적 필드만 사용 가능
		// a = 0; 에러
		b = 1;
		
		sub3();
		// sub1(); 에러
	}
	
	static void sub3() {
		
	}
}

public class AiSoftware {

	public static void main(String[] args) {
		
		
		
	}
}
