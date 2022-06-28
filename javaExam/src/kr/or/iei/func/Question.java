package kr.or.iei.func;
import java.util.Scanner;
public class Question {
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		// 버블 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		int sum = 0;
		System.out.print("정렬 결과 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"    ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("입력한 수의 총 합은 : "+sum);
		
	}//메서드
} //클래스