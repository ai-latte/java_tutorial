package kh.java.func;

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
		for(int i=0; i<8; i++) { // 0,1,2,3,4...8
			if(i<5) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				} System.out.println();
			} else {for(int j=i+2; j<10; j++) {
						System.out.print("*");
					} System.out.println();
				}

		}
	}
	
	
	
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
	
	
	
}