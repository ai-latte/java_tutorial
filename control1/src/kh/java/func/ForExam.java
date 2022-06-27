package kh.java.func;
import java.util.Scanner;
public class ForExam {
	
	public void exam1() {
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
	}
	
	
	public void exam2() {
		for(int i=0; i<5; i++) {
			System.out.println("*");
		}
	}
	
	
	public void exam3() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	
	
	
	public void exam4() {
		for(int i=1; i<6; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i);
			} System.out.println();
		}
	}
	
	
	
	public void exam5() {
		for(int i=0; i<5; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(j);
			} System.out.println();
		}
	}
	
	
	public void exam6() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j+i+1);
			} System.out.println();
		}
	}
	
	
	public void exam7() {
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				System.out.print(j+i);
			} System.out.println();
		}
	}
	
	
	
	public void exam8() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	public void exam9() {
		for(int i=5; i>0; i--) { //5 /4 /3 /2 /1
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	
	
	public void exam10() {
		for(int i=5; i>0; i--) { //5/4/3/2/1
			for(int k=i; k<5; k++) {
				System.out.print(" ");
			}				
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}	System.out.println();	
		}
	}
	
	
	
	
	public void exam11() {
		for(int i=5; i>0; i--) { //5/4/3/2/1
			for(int k=i; k>0; k--) {
				System.out.print(" ");
			}				
			for(int j=i-1; j<5; j++) {
				System.out.print("*");
			}	System.out.println();
		}
	}
	
	/*
	*
	**
	***
	****
	***** i=6
	****
	***
	**
	*
	*/
	
	
	public void exam12() {
		for(int i=0; i<9; i++) { // 0,1,2,3,4...9
			if(i<5) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				} System.out.println();
			} else {for(int j=i+1; j<10; j++) {  // t: (int j=0; j<9-i; j++)
						System.out.print("*");  
					} System.out.println();
				}
		} // 학습목표 : 필요에 따라 for문을 조절해서 쓸 수 있다.
	}
	
	
	//강사님 풀이
	public void exam12_t() {
		for(int i=0; i<9; i++) { // 0,1,2,3,4...9
			for(int j=0; (i<5)? j<i+1: j<9-i; j++) {
					System.out.print("*");
				} System.out.println();
				}
		} // 학습목표 : 필요에 따라 for문을 조절해서 쓸 수 있다.
	
	
	/*
	*****
	****
	***
	**
	*
	**
	***
	****
	*****
	*/
	
	public void exam13() { 
		for(int i=0; i<9; i++) {
			if(i<4) {
				for(int j=5; j>i; j--) {
				System.out.print("*");
			} System.out.println();
			} else {
				for(int j=1; j<i-2; j++) {
				System.out.print("*");
			} System.out.println();
			}
		}
	}
	
	
	

	/* i는 1부터~5
	 *줄 = i 가 반복횟수
	 * 16 for 1개로
	 *i=1; 2i-1 i++
	 *j=5 5-i
	 *for(i=1;
	 * 
	(4)1 =5
	(3)3 =6
	(2)5 =7
	(1)7 =8
	(0)9 =9
	*/
	
	
	public void exam16() {
		for(int i=1; i<=5; i++) {
			for(int j=5; i<j; j--) {
				System.out.print(" ");
			} //12345
			for(int k=0; k<(i*2)-1; k++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	
	
	
	// i= 1, 2, 3, 4, 5
	public void exam17() {
		for(int i=1; i<=5; i++) {
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=10; j>(i*2)-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	//다이아 별
	public void exam18() {
		for(int i=1; i<=9; i++) {
			if(i<5) {
				for(int j=5; j>i; j--) {
					System.out.print(" ");
				}
				for(int j=0; j<(2*i)-1; j++) {
					System.out.print("*");
				} System.out.println();
			} else {
				for(int j=5; j<i; j++) { 		//j<i일 때, j++이며 i-j횟수만큼 왼쪽으로 출력
					System.out.print(" ");
				}
				for(int j=18; j>(2*i)-1; j--) {   //j>i일 때, j--이며 j-i횟수만큼 왼쪽으로 출력
					System.out.print("*");
				} System.out.println();
			}
		}
	}
	
	
	
	//다이아 공백
	public void exam19() { // 54321 별
		for(int i=1; i<=9; i++) {
			if(i<=5) { //12345
				for(int j=0; j>=i-5; j--) { //54321 별 
					System.out.print("*");
				}
				for(int j=0; j<(2*i)-1; j++) { //13579 공백 
					System.out.print(" ");
				}
				for(int j=0; j>=i-5; j--) {  //54321 별
					System.out.print("*");
				} System.out.println();
				
			} else { //6789
				for(int j=0; j<i-4; j++) { 		//j<i일 때, j++이며 i-j횟수만큼 왼쪽으로 출력
					System.out.print("*");
				}
				for(int j=0; j>(2*i)-19; j--) {   //j>i일 때, j--이며 j-i횟수만큼 왼쪽으로 출력
					System.out.print(" ");
				}
				for(int j=0; j>i; j--) { //별 2, 3, 4, 5
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
	
	
	
		// n단 입력받아 출력
		public void prac1() {
			Scanner sc = new Scanner(System.in);
			System.out.print("몇 단을 출력하시겠습니까?");
			int num = sc.nextInt();
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		}
		
		
		//*찍기
		
		public void prac2() {
			for(int i=0; i<5; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<5-i; j++) {
					System.out.print("*");
				} System.out.println();
			}
		}
	
	
		
		
		public void parc3() {
			for(int i=1; i<10; i++) {
				if(i<6) { //1,2,3,4
					for(int j=1; j<i; j++) {
						System.out.print(" ");
					} //5, 4, 3, 2, 1
					for(int k=0; k<6-i; k++) {
						System.out.print("*");
					} System.out.println();
				} else { // i= 6, 7, 8, 9 //3 2 1 0
					for(int j=0; j<9-i; j++) {
						System.out.print(" ");
					} // 2, 3, 4, 5
					for(int k=4; k<i; k++) {
						System.out.print("*");
					} System.out.println();
				}
			}
		}
		
		
}