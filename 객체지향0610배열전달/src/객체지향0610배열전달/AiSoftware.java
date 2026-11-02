package 객체지향0610배열전달;

class ArrayArgumentTest {
	
	// 인수로 받아온 리스트의 최소값을 반환하는 메소드
	int minArrayValue(int [] list) {
		// 기본값을 리스트의 첫번째 수 대입
		int min = list[0];
		for(int i = 0; i < list.length; i++) {
			// 리스트의 각 원소랑 비교하여 원소값이 작으면 min값에 넣는다.
			if(list[i] < min) {
				
				min = list[i];
			}
		}
		return min;
		
		
	}
	// 디폴트 생성자 (이거 안해도 자바가 알아서 만들어주긴함)
	ArrayArgumentTest() {
		
	}
}

public class AiSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 1, 44, 22, 33, 11};
		int[] b = {2, 21, 44, 22, 33, 11, 9, 8, 7, 6};
		// ArrayArgumentTest 객체를 생성하고 minArrayValue 메소드를 실행
		ArrayArgumentTest obj;
		obj = new ArrayArgumentTest();
		int min = obj.minArrayValue(a);
		System.out.println(min);
		int min2 = obj.minArrayValue(b);
		System.out.println(min2);
	}
}
