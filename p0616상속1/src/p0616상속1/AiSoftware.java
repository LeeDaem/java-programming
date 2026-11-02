package p0616상속1;


class Animal{
	int age;
	private int pri; // 프라이빗은 자식클래스에서 접근할수없음
	protected int pro; // 나머지는 접근 가능
	public int pub;
	void eat() {
		System.out.println("먹고 있음");
	}	
	Animal(int a) {
		System.out.println("Animal생성자 1");
	}
	
 }

// Animal 클래스로 부터 상속받는 Dog 클래스를 생성
// bark : 짖다.  메소드 가진다
class Dog extends Animal {
	void bark () {
		System.out.println("멍멍멍");
	}
	Dog () {
		super(2); // 부모클래스의 생성자에 매개변수가 있을때는 부모생성자 호출명령어인 super 에 인수를 주면 사용가능하다.
		System.out.println("Dog생성자 1");
	}
	
	// Dog클래스에 매개변수 1개 int를 입력 받는 생성자를 추가하시오
	
	Dog (int a) {
		super(1);
		System.out.println("매개변수 Dog생성자");
		
	}
}

public class AiSoftware {

	public static void main(String[] args) {
		// Dog 객체를 생성 시켜서, eat메소드와 bark메소드를 실행
		Dog object = new Dog(1);
//		object.eat();
//		object.bark();
		
		int x = 5;
		int y = 5;
		ThreeDimPoint object1 = new ThreeDimPoint(x, y, y);
		
	}
}
	
		
class TwoDimPoint {
	int x, y;
	public TwoDimPoint() {
		x = y = 0;
	}			
	
	public TwoDimPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ThreeDimPoint extends TwoDimPoint {
	int z;
	public ThreeDimPoint(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}
		
		
		
		
		