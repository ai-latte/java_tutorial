package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.vo.User;

public class Exam {

	public void exam1() {

		User[] userArr = new User[10];
		int index = 0;

		User user1 = new User("user01", "유저1", 23, "01022478875");
		User user2 = new User("user02", "유저2", 27, "01095887774");
		User user3 = new User("user03", "유저3", 34, "01036425456");

		userArr[index++] = user1;
		userArr[index++] = user2;
		userArr[index++] = user3;

		System.out.println("아이디\t이름\t나이\t전화번호");
		for (int i = 0; i < index; i++) {
			System.out.println(userArr[i].id + "\t" + userArr[i].getName() + "\t" + userArr[i].getAge() + "\t"
					+ userArr[i].getPhone());

		}

	}

	public void test2() {
	Scanner sc = new Scanner(System.in);
	int cacheHit = 0;
	int cacheMiss = 0;
	String str = "Hello";
	String str1 = str.toLowerCase(); //-> str문자열을 전부 소문자로 바꿔서 리턴
	String str2 = str.toUpperCase(); //-> str문자열을 전부 대문자로 바꿔서 리턴

//			String[] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
			String[] arr1 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//			String[] arr2 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//			String[] arr3 = {"Jeju", "Pangyo", "NewYork", "newyork"};
//			String[] arr4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
	
		String[] arrLower = new String[arr1.length];
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<arr1.length; i++) {
			arrLower[i] = arr1[i].toLowerCase();
		}
		// while(!(list.isEmpty()))
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arrLower[i]+"\t");
		}
		System.out.println();
		
//		int size = sc.nextInt();
		int cacheSize = 3;
		
		for(int i=0; i<arrLower.length; i++) {
			if(cacheSize>i) {
				list.add(0, arrLower[i]);
				cacheMiss++;
			} else {
				if(list.contains(arrLower[i])) {
					cacheHit++;
				} else {
					list.add(0, arrLower[i]);
					cacheMiss++;
				}
			}
			
		}
		
		System.out.println(list);
		int lru = cacheHit*1 + cacheMiss*5;
		System.out.println(lru);
		
		
//		list.add(arrLower[0]);
//		list.add(1, arrLower[1]);
		
//		list.add(0, arrLower[0]); 
//		
//		list.add(2, list.get(1));
//		list.add(1, list.get(0));
//		list.add(0, list.get(2));
//		
//		list.add(3, list.get(2));
//		list.add(2, list.get(1));
//		list.add(1, list.get(0));
//		
//		for(int i=0; i<cacheSize; i++) {
//			if(list2.get(i)==list.get(cacheSize)) {
//				cacheHit++;
//			} else {
//				list2.add(0, list.get(cacheSize));
//				cacheMiss++;
//			}
//		}
//		

	}
	
	
	
	
	
	
	
	
	


	public class LRUTest {
		public void main() {
			ArrayList<String> lru = new ArrayList<String>();
			Scanner sc = new Scanner(System.in);
			System.out.print("캐시의 크기를 입력하세요(0~30) : ");
			int cacheSize = sc.nextInt();
			String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//			String [] arr = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//			String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
//			String [] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
//			String [] arr = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
			if(cacheSize == 0) {
				System.out.println("총 시간 : "+arr.length*5);
			}else {
				int totalTime = 0;
				for(int i=0;i<arr.length;i++) {
					String city = arr[i].toLowerCase();//문자열을 모두 소문자로 변환하여 리턴
					//현재 lru에 이번회차 도시이름이 존재하는지 확인 
					//indexOf(매개변수) : 매개변수로 전달된 객체가 리스트의 몇번째에 존재하는지 리턴하는 메소드(존재하지않으면 -1 리턴)
					int result = lru.indexOf(city);
					if(result != -1) {		//현재 캐시에 해당하는 도시명이 존재하는경우
						lru.remove(result);
						lru.add(0,city);
						totalTime += 1;		//현재값 +1
					}else {					//현재 캐시에 해당하는 도시명이 존재하지 않는경우					
						if(lru.size() == 0) {	//현재 리스트가 비어있으면 그냥 맨뒤에 추가						
							lru.add(city);
						}else {
							if(lru.size() == cacheSize) {		//리스트길이와 캐시 최대크기 비교
								lru.remove(lru.size()-1);		//캐시가 꽉 차있으면 마지막데이터 삭제
							}
							lru.add(0,city);		//캐시에 도시명 추가
						}					
						totalTime += 5;		//현재값 +5
					}
				}
				System.out.println("최종 소요시간 : "+totalTime);
			}
		}
	}
		
	
	
	
}
		
