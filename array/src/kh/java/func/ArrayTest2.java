package kh.java.func;

public class ArrayTest2 {
	
	public void test1() {
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(arr1[2]); // 3
		System.out.println(arr1[3]); // 4
		// 얕은 복사 (주소 값 복사)
		int[] arr2 = arr1;
		System.out.println(arr2[4]); // 5
		// 같은 주소를 공유한다는 것은...
		arr1[4] = 100;
		System.out.println(arr1[4]); // 100
		System.out.println(arr2[4]); // 100
		arr2[0] = 10;
		System.out.println(arr1[0]); // 10
		System.out.println(arr2[0]); // 10
	}
	
	
	public void test2() {
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		//깊은 복사 (1)
			// 배열을 생성해서 제어문을 통한 직접 복사
			// 1-1) 원본배열과 동일한 길이의 배열 생성
		int[] arr2 = new int[arr1.length];
			// 1-2) for문을 통한 데이터 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[2] = 100;
		arr2[3] = 200;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
			System.out.println();
			// 1 2 100 4 5 6 
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			System.out.println();
			// 1 2 3 200 5 6 
			
		
		//깊은 복사 (2)
			// system.arraycopy 사용 (배열의 일부 데이터만 복사 가능)
			// 2-1) 원본 배열과 길이가 같은 배열 선언
			int[] arr3 = new int[arr1.length];
			// 2-2) System.arraycopy(괄호 안에 5개의 값을 설정)
			// (원본배열,
			//	원본배열에서 복사 시작할 위치,
			//	데이터가 복사될 배열,
			//	데이터가 복사될 배열 중 데이터가 들어갈 위치,
			//	복사할 길이)
			System.arraycopy(arr1, 2, arr3, 1, 2);
			// "arr1의 2번 인덱스부터 arr3의 1번 인덱스 위치에 2개 복사한다."
			
			for(int i=0; i<arr3.length; i++) {
				System.out.print(arr3[i]+" ");
			}
				System.out.println();
				// 0 100 4 0 0 0 
				
			int[] arr4 = new int[arr2.length];
			System.arraycopy(arr2, 2, arr4, 2, 4);
			
			for(int i=0; i<arr4.length; i++) {
				System.out.print(arr4[i]+" ");
			}
				System.out.println();
				// 0 0 3 200 5 6 
			
				
		// 깊은 복사 (3)
			// clone();
			int[] arr5 = arr1.clone();	
	}//메서드 끝
	
	
	
	
	public void test3() {
		//2차원 배열 생성
		int[][] arr = new int[2][3];
		// [0][0] [0][1] [0][2]
		// [1][0] [1][1] [1][2]
		
		// 2차원 배열 초기화
		// 1. 직접초기화
		int k = 1; // 후위연산 = 인접연산 하고 자기 자신을 올린다.
		arr[0][0] = k++;
		arr[0][1] = k++;
		arr[0][2] = k++;
		arr[1][0] = k++;
		arr[1][1] = k++;
		arr[1][2] = k++;
		
		// 2. 배열을 만들어 초기화
		int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
		
		// 3. for문을 이용한 초기화
		int[][] arr2 = new int[2][3];
		int num = 1;
		for(int i=0; i<arr2.length; i++) { 	// 행의 길이
			for(int j=0; j<arr2[i].length; j++) { // 열의 길이
				arr[i][j] = num++;
			}
		}

		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}

	}
	
	
	
	public void test4() {
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i=0; i<arr.length; i++) { 	// 행의 길이
			for(int j=0; j<arr[i].length; j++) { // 열의 길이
				arr[i][j] = num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			} System.out.println();
		}
	}
	
	/*
	 * 
	 * [0][0] [0][1] [0][2] [0][3] [0][4] //
	 * [1][0] [1][1] [1][2] [1][3] [1][4]
	 * [2][0] [2][1] [2][2] [2][3] [2][4] 
	 * 
	 * 
	 */
	
	public void exam1() {
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) { //1, 2, 3, 4, 5
			for(int j=4; j>=0; j--) {
				arr[i][j] = num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			} System.out.println();
		}
	}
	
	
	
	
	/*
	 * 
	 * [0][0] [0][1] [0][2] [0][3] [0][4]  +5
	 * [1][0] [1][1] [1][2] [1][3] [1][4]
	 * [2][0] [2][1] [2][2] [2][3] [2][4] 
	 * [3][0] [3][1] [3][2] [3][3] [3][4]
	 * [4][0] [4][1] [4][2] [4][3] [4][4]
	 */
	
	public void exam2() {
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			 num = i+1;
			for(int j=0; j<arr[i].length; j++) { //num=1
				arr[i][j] = num+(j*5);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			} System.out.println();
		}
	}
	
	
	
	public void exam3() {
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i=4; i>=0; i--) { //i=4
			for(int j=0; j<=4; j++) {
				arr[i][j] = j*5+num;
				// 한 행에서 인덱스가 늘어날 때마다 5씩 증가
			} num++; // 행이 바뀔 때마다 1증가
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			} System.out.println();
		}
	}
	
	
	/*
	 * [0][0] [0][1] [0][2] [0][3] [0][4]  +5
	 * [1][0] [1][1] [1][2] [1][3] [1][4]
	 * [2][0] [2][1] [2][2] [2][3] [2][4] 
	 * [3][0] [3][1] [3][2] [3][3] [3][4]
	 * [4][0] [4][1] [4][2] [4][3] [4][4]
	 */

	
	public void exam4() {
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) { // [0][0] 부터 시작
			
			if((i%2)==0) { //i=0;
				for(int j=0; j<=4; j++) {
					arr[i][j] = num++;
				}
			} else {
				for(int j=4; j>=0; j--) {
					arr[i][j] = num++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			} System.out.println();
		}
	}
	
	
	
	
	
	

	/*
	 * [0][0] [0][1] [0][2] [0][3] [0][4]  +5
	 * [1][0] [1][1] [1][2] [1][3] [1][4]
	 * [2][0] [2][1] [2][2] [2][3] [2][4] 
	 * [3][0] [3][1] [3][2] [3][3] [3][4]
	 * [4][0] [4][1] [4][2] [4][3] [4][4]
	 */

	
	public void practice1() {
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (j*5)+num;
			} num++;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}
		
	}
	
	
	

}//클래스 끝