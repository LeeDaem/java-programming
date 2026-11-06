package p261106제너릭;

class Box<T>{
   T value;
   public T getValue() {
      return value;
   }
   public void setValue(T value) {
      this.value = value;
   }
   
}

class Pair<K,V> {
	K key;
	V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}




public class BoxTest {

   public static void main(String[] args) {
      Box<String> object = new Box<>();
      object.setValue("Hello");
//      Box object = new Box();
//      object.setValue("Hello");
//      Box<Object> object = new Box<Object>();
//      object.setValue("Hello");x
      
      // 이름과 전화번호를 저장하는 주소록 객체 생성
      Pair<String, String> address = new Pair<>("홍길동", "010-3280-1296");
      
      // 저장된 이름과 전화번호 출력
      System.out.println("이름 : " + address.getKey());
      System.out.println("전화번호 : " + address.getValue());
      
      // 이름과 영어점수를 저장하는 Pair객체를 만들어서 이름과 영어점수를 출력하시오
      Pair<String, Integer> 영어성적 = new Pair<>("이대경", 67);
      System.out.println("이름 : " + 영어성적.getKey());
      System.out.println("영어 점수 : " + 영어성적.getValue());
   }

}