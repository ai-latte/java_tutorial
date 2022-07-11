package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListTest {
	//배열과 비교하면서 해보기
	public void listTest1() {
		//길이가 3인 문자열배열 선언
		String[] arr = new String[3];
		// 만들어지는 것과 동시에 배열의 길이가 결정됨
		arr[0] = "hi";
		arr[1] = "hello";
		arr[2] = "bye";
		System.out.println("배열의 길이 : "+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"."+arr[i]);
		}
		System.out.println("------------------------");
		// ArrayList는 객체 생성 시 배열로 관리할 자료형을 제네릭으로 지정
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("리스트의 길이 : "+list.size()); // 배열의 length 리스트의 size
		list.add("hi"); // 리스트 가장 뒤에 데이터 추가
		list.add("hello"); // add와 동시에 칸 생성
		list.add("bye"); // 생성된 칸에 입력한 문자가 들어감
		// 배열은 초기화한 값으로 길이가 정해지지만, 리스트는 길이제한이 없다
		System.out.println("리스트의 길이 : "+list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	public void listTest2() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			System.out.print("리스트에 추가할 숫자 입력 : ");
			int num = sc.nextInt();
			list.add(num);
			// 입력 받은 수를 리스트에 추가
			System.out.println("한 번 더 입력하시겠습니까 [y/n] ? ");
			String sel = sc.next();
			if(sel.toLowerCase().equals("n")) { // 소문자로 바꿔준 후 이퀄스
				break;
			} 
		}
		// System.out.println(list);
		// [4, 4, 1] toString을 통해서 정보를 주는것뿐임
		for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		// foreach (전체를 순회할 때 쓰는 것이 좋음)
		for(int num : list) { // 리스트 전체를 순회한다
			//리스트를 순서대로 꺼내서 num에 넣어준다
			System.out.println(num);
		}
	}
	
	
	
	public void test3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(100);
		list.add(55);
		list.add(80);
		System.out.println(list);
		// get(index) : 해당 인덱스에 위치한 객체를 가져오는 메서드
		System.out.println(list.get(2));
		// add(param1) : 매개변수로 받아온 값을 리스트 가장 맨뒤에 추가한다
		list.add(15);
		System.out.println(list);
		// add(param1, param2) : 첫번째 매개변수 위치에, 두번째 매개변수 값 추가
		// 추가한 데이터 이후의 인덱스 번호는 1개씩 밀린다
		list.add(3, 200);
		System.out.println(list);
		
		// set(param1, param2) : 첫번째 매개변수 위치에, 두번째 매개변수 값으로 수정
		list.set(3, 140);
		System.out.println(list);
		
		// remove(param1) : 매개변수 위치에 있는 객체를 리스트에서 삭제
		// clear() : 리스트 내부 모든 데이터를 삭제
		list.remove(3);
		System.out.println(list);
		
		// contains(param1) : 매개변수로 전달한 값이 리스트에 존재하는지 확인하여 결과 리턴
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty()); // 비어있지 않으면 false
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty()); // 비어있으면 true
		System.out.println(list.size());
		
	}
	
}

	
	

