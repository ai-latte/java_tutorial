package kh.java.func;
import java.util.Scanner;
import java.util.Random;
public class ArrayTest {
	public void test1() {
	// 정수형 변수 5개 선언 1/2/3/4/5
	int num0 = 1;
	int num1 = 2;
	int num2 = 3;
	int num3 = 4;
	int num4 = 5;
	System.out.println("변수를 이용한 값 출력");
	System.out.println(num0);	
	System.out.println(num1);	
	System.out.println(num2);	
	System.out.println(num3);	
	System.out.println(num4);	
	
	int[] arr = new int[5];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	System.out.println("배열을 이용한 값 출력");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	// 배열의 경우 반복문을 이용해서 출력 가능
	
	System.out.println("반복문을 이용한 배열 출력");
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
	
	
	public void test2() {
	int[] arr1 = new int[5];
	for (int i=0; i<arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	arr1[0] = 1;
	arr1[1] = 2;
	arr1[2] = 3;
	arr1[3] = 4;
	arr1[4] = 5;
	for (int i=0; i<arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	// 2) 배열 선언 시 동시에 값 대입
	int[] arr2 = {1, 2, 3, 4, 5};
	for(int i=0; i<6; i++) {
		System.out.println(arr2[i]);
	}
	}
	
	
	
	public void test3() {
		// 배열에 "hi", "hello", "bye"를 대입
		// 두 가지 방법 사용
		
	String[] arr3 = new String[3];
	arr3[0] = "hi";
	arr3[1] = "hello";
	arr3[2] = "bye";
	
	for(int i=0; i<arr3.length; i++) {
		System.out.println(arr3[i]);
	}
	
	String[] arr4 = {"hi", "hello", "bye"};
	
	for(int i=0; i<arr4.length; i++) {
		System.out.println(arr4[i]);
	}
	}
	
	
	
	public void test4() {
		// 길이가 4인 정수형 배열 선언
		// 스캐너를 이용해 국어 점수, 수학점수 영어점수를 입력 받아 배열에 저장
		// 마지막에는 합계를 저장
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		System.out.print("국어점수 입력 : ");
		arr[0] = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		arr[1] = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		arr[2] = sc.nextInt();
		arr[3] = arr[0]+arr[1]+arr[2];

		System.out.printf("국어 : %d / 수학 : %d / 영어 : %d / 합계 : %d / 평균 : %.2f", arr[0], arr[1], arr[2], arr[3], arr[3]/(float)3);
	}
	
	
	
	public void test5() {
		//길이 100인 정수형 배열 선언
		// 1~100까지 순서대로 대입 후 출력
		
		int[] arr = new int[100];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}
	
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수를 입력하세요 > ");
			arr[i] = sc.nextInt();
		}
		
		/*
		// <<<버블정렬>>>
		// 배열 0번째 값과 배열 1번째 값을 비교해서
		// 0번째가 큰 경우 두 수의 자리를 변경
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		
		if(arr[0]>arr[1]) {
			int tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
		}
		
		//1번째 2번째 비교해서 자리변경
		//2번째 3번째 비교해서 자리변경
		//3번째 4번째 비교해서 자리변경
		//4번째 5번째 비교해서 자리변경
		
		
		if(arr[1]>arr[2]) {
			int tmp = arr[1];
			arr[1] = arr[2];
			arr[2] = tmp;
		}
		
		if(arr[2]>arr[3]) {
			int tmp = arr[2];
			arr[2] = arr[3];
			arr[3] = tmp;
		}
		
		if(arr[3]>arr[4]) {
			int tmp = arr[3];
			arr[3] = arr[4];
			arr[4] = tmp;
		}
		
		*/
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[i]>arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			}
	}
	
	
	
	
	// 1~45 숫자를 중복되지 않게 6개 받아서 사용
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int userNum[] = new int[6];
		int comNum[] = new int[6];
		
		System.out.println("======로또 프로그램======");
		for(int i=0; i<userNum.length; i++) {
			System.out.print((i+1)+"번째 번호 입력 (1~45) : ");
			userNum[i] = sc.nextInt();
			if(userNum[i]>45 || userNum[i]<1) {
				System.out.println("잘못입력하셨습니다. 1~45 중 한 개를 입력하세요.");
				i--;
				continue; //증감문으로 가기 때문에 미리 i--;
			}
				
			//중복체크 >
			for(int j=0; j<i; j++) { //j가 i전일 때까지 비교하겠다.
				if(userNum[i] == userNum[j])  { //i==3일때, userNum[3]과 [0,1,2] 비교
					System.out.println("이미 입력된 번호입니다. 다시 입력하세요.");
					i--;
					break; // 증감문으로 이동한다
				}
			}			
		}
		
		
		for(int i=0; i<userNum.length-1; i++) {
			for(int j=0; j<userNum.length-1-i; j++) {
				if(userNum[j]>userNum[j+1]) {
					int tmp = userNum[j];
					userNum[j] = userNum[j+1];
					userNum[j+1] = tmp;
				}
			}
		}
		
		
		//com을 받아서 중복체크
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = r.nextInt(45)+1;
			for(int j=0; j<i; j++) { // i=0일때는 지나감, i=1일때는 1번, i=2일 떄는 j=0,1 두 번
				if(comNum[i]==comNum[j]) {
				i--;
				continue;
				}
			}
		} //test!!! >>>>> nextInt(6)+1
		
		//com 정렬
		
		for(int i=0; i<comNum.length-1; i++) { //5번
			for(int j=0; j<comNum.length-1-i; j++) {
				if(comNum[j]>comNum[j+1]) {
					int tmp = comNum[j];
					comNum[j] = comNum[j+1];
					comNum[j+1] = tmp;
				}
			}
		}
	
		
		System.out.println();
		
		// 사용자 번호, 컴퓨터 번호 출력
		System.out.println("======최종결과======");
		System.out.println("사용자 번호");
		for(int i=0; i<userNum.length; i++) {
			System.out.print(userNum[i]+" ");
		}
		System.out.println();
		System.out.println("컴퓨터 번호");
		for(int i=0; i<comNum.length; i++) {
			System.out.print(comNum[i]+" ");
		}
		
		System.out.println();
		// 일치하는 갯수 카운팅
		int count = 0;
		for(int i=0; i<userNum.length; i++) {
			for(int j=0; j<comNum.length; j++) {
				if (userNum[i]==comNum[j]) {
					count++;
					break; //브레이크필요!!!!!
				}
			}
		}
		
		System.out.println("맞은 갯수 : "+count);
		
		// 맞은 갯수
		switch (count) {
		case 0 : case 1: case 2: // == default
			System.out.println("꽝!");
			break;
		case 3 :
			System.out.println("4등입니다.");
			break;
		case 4 :
			System.out.println("3등입니다.");
			break;
		case 5 :
			System.out.println("2등입니다.");
			break;
		case 6 :	
			System.out.println("축하합니다. 1등입니다.");
			break;
		}
		
	}//end of method
	

	
	
	
	
	
	public void exam2() { 
		Random r = new Random();
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			num[i] = r.nextInt(45)+1;
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		// 내림차순으로 정렬
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i; j++) {
			if(num[j]<num[j+1])	 {
				int tmp = num[j];
				num[j] = num[j+1];
				num[j+1] = tmp;
			}
			}
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
	
	}
	
	
	
	
	public void practice( ) {
		Scanner sc = new Scanner(System.in);
		int[] user = new int[6];
		Random r = new Random();
		
		for(int i=0; i<user.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력해 주세요 : ");
			user[i] = sc.nextInt();
			if(user[i]>45 || user[i]<1) {
				System.out.println("1~45 사이 값으로 다시 입력해 주세요.");
				i--;
				continue;
			}
			// 중복을 제거
			// 0번, 1번, 2번, 3번, 4번, 5번
			for(int j=0; j<i; j++) {
				if(user[i] == user[i-1]) {
					System.out.println("이미 입력한 값입니다. 다시 입력하세요");
					i--;
					continue;
				}
			}			
		}
		
		// 오름차순정렬
		for(int i=0; i<user.length-1; i++) {
			for(int j=0; j<user.length-1-i; j++) {
				if(user[j]>user[j+1]) {
					int tmp = user[j];
					user[j] = user[j+1];
					user[j+1] = tmp;
				}
			}
		}
	
		for(int i=0; i<user.length; i++) {
			System.out.print(user[i]+"  ");
		}
	
		System.out.println();
		
		int[] com = new int[6];
		for(int i=0; i<com.length; i++) {
			com[i] = r.nextInt(6)+1;
			for (int j=0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
					continue;	
				}				
			}
		}
	
		//com 오름차순 정리
		for(int i=0; i<com.length-1; i++) {
			for(int j=0; j<com.length-1-i; j++) {
				if(com[j]>com[j+1]) {
					int tmp = com[j];
					com[j] = com[j+1];
					com[j+1] = tmp;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i]+"  ");
		}
		
		
		//user==com 일치하는지
		
		int count = 0;
		for(int i=0; i<user.length-1; i++) {
			for(int j=0; j<com.length; j++) {
				if(user[i]==com[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println(count+"개 맞았습니다.");
		switch(count) {
		case 6 :
			System.out.println("1등입니다.");
			break;
		case 5 :
			System.out.println("2등입니다.");
			break;
		case 4 :
			System.out.println("3등입니다.");
			break;
		case 3 :
			System.out.println("4등입니다.");
			break;
		default :
			System.out.println("꽝~!");
		}
		
		
	}//end of method
	
} //end of class