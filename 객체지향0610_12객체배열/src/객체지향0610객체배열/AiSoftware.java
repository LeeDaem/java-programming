package 객체지향0610객체배열;

class Rect {
	int width;	// 가로
	int height; // 세로
	// 생성자 : 가로와 세로값을 입력받아 필드를 초기화 하는 생성자를 생성
	Rect(int w, int h) {
		width = w;
		height = h;
		
	}
	// 디폴트 생성자 : 가로와 세로의 값을 각각 5로 설정하시오
	Rect() {
		width = 5;
		height = 5;
	}
	
	// 넓이를 구하여 반환하는 인스턴스 메소드를 getArea 이름으로 정의하시오.
	int getArea() throws Exception{ // 예외 떠넘기기 throws Exception
	
		int a = 10 / 0;
		return width * height;
	}
	
	// 화면 우클릭 소스에 오버라이드메소드 toString선택
	@Override
	public String toString() {
		
		String a = null;
		try {
			a = "가로는 " + this.width + "세로는 " + height + "넓이는 " + getArea();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("toString에서 예외 처리");
		}
		
		return a;
	}
	
	
	
	
}

public class AiSoftware {

	public static void main(String[] args) {
		// 5개 Rect 객체를 저장할 수 있는 Rect 객체 배열 list를 생성
		Rect[] list;
		list = new Rect[5];
		
		// 5개 Rect 객체를 만들면서 가로 세로가 각각 3, 5   4, 6   5, 7   6, 8    7, 9 
		for(int i = 0; i < list.length; i++) {
			list[i] = new Rect(3 + i , 5 + i);
		}
		
		// 각 객체의 가로, 세로, 넓이를 출력하는 코드 작성 foreach사용
		
		for(Rect i : list) {
			System.out.println(i);
		}
		
		
//		// 예외 처리
//		// 예외가 없으면 "try/catch 통과"만 출력
//		try {
//			// 예외가 발생할 수 있는 코드
//			int a = 10 / 0;
//		} catch (Exception e) { // 예외 클래스 변수
//			// 예외를 처리하는 코드
//			System.out.println("오류 발생   " +  e);
//			// e 넣으면 무슨 오류인지 뜸
//		} finally {
//			// 여기 잇는 코드는 try 블록이 끝나면 무조건 실행
//			System.out.println("try/catch 통과");
//		}
		
		// 배열 인덱스 예외 처리
//		for(int i = 0; i < 10; i++ ) {
//			System.out.println(list[i]);
//			// 배열이 5개인데 6번째 배열을 불러서 오류발생함
//		}
		try {
			System.out.println(list[6]);
		} catch (Exception e1) {
			System.out.println("A오류 발생");
//			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
