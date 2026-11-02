// 클래스 정의
class Circle {
    // 필드
    int 반지름;
    
    // 메소드  
    double getArea() {
        double result = 3.14 * 반지름 * 반지름;
        return result;
    }
    
}



public class ClassTest {
    public static void main(String[] args) {
        
        // 객체 생성
        Circle object = new Circle();
        object.반지름 = 5;
        System.out.println(object.getArea());
    }
}