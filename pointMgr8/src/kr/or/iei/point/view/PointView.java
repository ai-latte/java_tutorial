package kr.or.iei.point.view;
import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;


public class PointView {
	private Scanner sc;
	
	public PointView() {
		super();
		sc = new Scanner(System.in);
	}

	public int getSel() {
		System.out.println("--- 회원 관리 프로그램 ---");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 전체 출력");
		System.out.println("3. 회원 정보 1명 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 >>> ");
		return sc.nextInt();
	}

	public Grade insertMember() {
		System.out.println("--- 회원 정보 등록 ---");
		System.out.print("회원 등급 입력 : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		Grade g = null;
		switch(grade) {
		case "silver" :
			g = new Silver(grade, point, name);
		case "gold" :
			g = new Gold(grade, point, name);
		case "vip" :
			g = new Vip(grade, point, name);
		}
		return g;
	}

	public void printAllMember(ArrayList<Grade> members) {
		System.out.println("--- 전체 회원 출력 ---");
		System.out.println("등급\t이름\t포인트\t보너스");
		for(Grade g : members) {
			System.out.print(g.getGrade()+"\t");
			System.out.print(g.getName()+"\t");
			System.out.print(g.getPoint()+"\t");
			System.out.print(g.getBonus()+"\t");
			System.out.println();
		}
	}

	public String getMemberName(String str) {
		System.out.println("--- 회원 정보 "+str+" ---");
		System.out.print(str+"할 회원 이름 입력 : ");
		return sc.next();
	}

	public void noSearchMember() {
		System.out.println("잘못입력하셨습니다");
	}

	public void printOneMember(Grade g) {
		System.out.println("회원 등급 : "+g.getGrade());
		System.out.println("회원 이름 : "+g.getName());
		System.out.println("회원 포인트 : "+g.getPoint());
		System.out.println("회원 보너스 : "+g.getBonus());
	}

	public Grade updateMember() {
		System.out.print("수정할 회원 등급 : ");
		String grade = sc.next();
		System.out.print("수정할 회원 이름 : ");
		String name = sc.next();
		System.out.print("수정할 회원 포인트 : ");
		sc.nextLine();
		int point = sc.nextInt();
		Grade g = null;
		switch(grade.toLowerCase()) {
		case "silver" :
			g = new Silver(grade, point, name);
		case "gold" :
			g = new Gold(grade, point, name);
		case "vip" :
			g = new Vip(grade, point, name);
		}
		return g;
	}

	

}
















