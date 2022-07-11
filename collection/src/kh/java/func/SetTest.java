package kh.java.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
	public void setTest() {
		HashSet<Integer> set = new HashSet<Integer>();
		//set은 인덱스 번호가 없다
		set.add(10);
		System.out.println("set의 길이 : "+set.size());
		System.out.println(set);
		set.add(20);
		set.add(30);
		System.out.println(set);
		// 순서가 없이 들어간다, 중복값을 허용하지 않는다
		set.add(10); // 이미 존재하기 때문에 들어가지 않는다
		System.out.println(set);
		boolean bool1 = set.add(20); //데이터 추가를 시도하고 그 결과를 리턴
		System.out.println(bool1); // false리턴
		boolean bool2 = set.add(100);
		System.out.println(bool2); // true리턴
		set.remove(100); // 매개변수로 받은 데이터와 일치하는 value를 찾아 삭제
		// 인덱스가 없기 때문에 값을 넣는다
		System.out.println(set+" < set"); // set의 목적 : 중복을 처리한다
		
		// set은 인덱스로 관리하지 않기 때문에 꺼내는 방법이 필요
		// 1. foreach
		for(Integer num : set) { // 전부 순회한다
			System.out.println((num));
		}
		
		// 2. ArrayList 활용
		// set에 저장된 데이터와 동일한 타입을 저장할 수 있는 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list+" < list");
		
		// 3. 반복자(iterator)를 이용한 방법
		Iterator<Integer> iter = set.iterator(); // set에 있는 값을 토큰으로 잘라서 가지고 있음
		// hasNext(): 꺼내올 값이 남아있으면 t/ 없으면 f리턴
		// next(): 값 한 개를 꺼내옴
		
		while(iter.hasNext()) { // 꺼내올 값이 없을 때까지
			Integer num = iter.next();
			System.out.println(num);
		} // 가장 정확한 set
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> userNum = new HashSet<Integer>();
		
		while(userNum.size()<6) {
			System.out.print("사용자 번호 입력 [1~45] : ");
			int num = sc.nextInt();
			if(num>0 && num <46) {
				boolean bool = userNum.add(num);
				if(!bool) {
					System.out.println("중복된 숫자입니다");
				}
			} else {
				System.out.println("1~45 사이 숫자를 입력하세요 ");
			}
		}
		
		ArrayList<Integer> userList = new ArrayList<Integer>(userNum);
		Collections.sort(userList);
		System.out.println(userList);
	} // 자바는 아는만큼 쓰는 것
	
	
	
	
	
	
	
	

}
