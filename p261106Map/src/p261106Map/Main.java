package p261106Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();	
		map.put("장호진", "11111111");
		map.put("최익훈", "22222222");
		
		System.out.println( map.get("장호진"));
		System.out.println( map.containsKey("장호진"));
		System.out.println( map.containsKey("이대경"));
		System.out.println( map.keySet());
		
		Set<String> set = map.keySet();
		System.out.println(set);
		System.out.println(set.size());
	}
}