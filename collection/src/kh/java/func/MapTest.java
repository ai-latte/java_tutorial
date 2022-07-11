package kh.java.func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public void mapTest1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("hi");
		System.out.println(list.get(1));
		
		// 정수를 통해서 문자열을 관리하는 맵 생성
		// 순서대로 0인덱스부터 넣는 list와 달리 map은 지정해주어야 함
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "hi");
		map.put(1, "hello");
		map.put(2, "bye");
		map.put(3, "hi");
		System.out.println(map.get(1)); // hello
	}
	
	
	public void mapTest2() {
		HashMap<String, String> map = new HashMap<String, String>();
		// put(key, value> : map에 데이터를 삽입하는 메서드
		// key는 중복되지 않는 값
		map.put("one", "hi");
		map.put("two", "hello");
		map.put("three", "bye");
		System.out.println(map);
		// 넣을 때 쓴 키값을 통해 value를 구해온다
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		map.put("two", "집");
		System.out.println(map.get("two"));
		// 겹치는 key값을 넣게되면 이전 데이터에 덮어쓰기
		map.put("zero", "hi"); //value가 겹치는 건 아무 상관 없음
		System.out.println(map.get("four")); //null
		//containsKey(param) : 매개변수로 받은 데이터가 key로 사용중이면true, 사용중이지 않으면 false
		boolean bool1 = map.containsKey("one");
		boolean bool2 = map.containsKey("four");
		System.out.println(bool1); //true
		System.out.println(bool2); //false
		// remove(key) : 키값에 해당하는 데이터를 삭제
		System.out.println(map);
		map.remove("two");
		System.out.println(map);
		// map에 있는 모든 데이터 꺼내올 때 = 키 전체를 알아야 함
		Set<String> keys = map.keySet(); // 모든 key값을 set형태로 가져옴
		for(String key : keys) { // 가져올 값 : 전체값
			System.out.println(map.get(key));
		}
	}
	
	
	
	
	
}
