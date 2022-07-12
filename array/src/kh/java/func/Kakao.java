package kh.java.func;
import java.util.Scanner;
public class Kakao {
	public void test1() {
		// 배열의 길이
		int size = 5;
		int[][] map1 = new int[size][size];
		int[][] map2 = new int[size][size];
		int[][] result = new int[size][size];
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		for(int k=0; k<arr1.length; k++) {
			for(int i=(size-1); i>0; i--) { //k =-0
					map1[k][i] = arr1[k]%2;
					arr1[k]/=2;
			}
		}
		
		for(int k=0; k<arr2.length; k++) {
			for(int i=size-1; i>0; i--) { //k =-0
					map2[k][i] = arr2[k]%2;
					arr2[k]/=2;
			}
		}
		
		//result 값 얻기
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				if(map1[i][j]==1 || map2[i][j]==1) {
					result[i][j] = 1;
				} else {
					result[i][j] = 0;
				}
		}
		
		}
		
		System.out.println("맵 1 출력");
		for (int i=0; i<map1.length; i++) {
			for(int j=0; j<map1.length; j++) {
				if(map1[i][j]==0) {
					System.out.print("공");
				} else {
					System.out.print("#");
				}
			} System.out.println();
		}
		
		System.out.println("맵 2 출력");
		for (int i=0; i<map1.length; i++) {
			for(int j=0; j<map1.length; j++) {
				if(map2[i][j]==0) {
					System.out.print("공");
				} else {
					System.out.print("#");
				}
			} System.out.println();
		}
		
		
		System.out.println("result 출력");
		for (int i=0; i<result.length; i++) {
			for(int j=0; j<result.length; j++) {
				if(result[i][j]==0) {
					System.out.print("공");
				} else {
					System.out.print("#");
				}
			} System.out.println();
		}
		
		
	}
}