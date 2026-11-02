package p061701오버라이딩;

// draw 메소드를 가지는 Shape 클래스를 작성하고 멤버 변수로 x, y 좌표를 가진다.
class Shape {
	int x, y;
	// 디폴트 생성자를 만드시오( 필드 값을 각각 5로 세팅하세요)
	Shape() {
		x = 5;
		y = 5;
		System.out.println(x + y);
	}
	// 매개변수로 x, y를 입력받아 필드를 초기화하는 생성자를 만드시오
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + y);
	}
	
	void draw() {
		System.out.println("Shape");
	}
}

// Shape 클래스로 부터 상속 받아 Circle클래스를 작성하시오
// 추가로 radius (반지름) 정수 필드를 가진다.

class Circle extends Shape {
	int radius;
	
}






public class Abb {
	
	public static void main(String[] args) {
		// Circle 객체를 생성하여 object변수에 저장
		Circle object = new Circle();
		// circle 객체의 draw 메소드 출
		object.draw();
		System.out.println(object.x);
	}	
}
