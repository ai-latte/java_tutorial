package kr.or.iei.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointView {
	Scanner sc = new Scanner(System.in);

	public int showMenu() {
		System.out.println("==== 회원 관리 프로그램 ====");
		System.out.println("1. 회원 정보 등록 ");
		System.out.println("2. 회원 정보 전체 출력 ");
		System.out.println("3. 회원 정보 1명 출력 ");
		System.out.println("4. 회원 정보 수정 ");
		System.out.println("5. 회원 정보 삭제 ");
		System.out.println("0. 프로그램 종료 ");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	public Grade insertMember() {
		System.out.println("---- 회원 정보 등록 ----");
		System.out.print("회원 등급 : ");
		String grade = sc.next();
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 포인트 : ");
		sc.nextLine();
		int point = sc.nextInt();
		Grade g = null;
		switch(grade) {
		case "silver" :
			g = new Silver(grade, name, point);
			return g;
		case "gold" :
			g = new Gold(grade, name, point);
			return g;
		case "vip"	:
			g = new Vip(grade, name, point);
			return g;
		case "vvip"	:
			g = new Vvip(grade, name, point);
			return g;
		}
		return g;
	}

	public void noSearch() {
		System.out.println("잘못 입력하셨습니다");
	}

	public void printAllMembers(ArrayList<Grade> members) {
		System.out.println("---- 전체 회원 출력 ----");
		System.out.println("등급\t회원\t포인트\t보너스\t");
		for (Grade g : members) {
			System.out.print(g.getGrade()+"\t");
			System.out.print(g.getName()+"\t");
			System.out.print(g.getPoint()+"\t");
			System.out.print(g.getBonus()+"\t");
			System.out.println();
		}
		
	}

	public String getName(String str) {
		System.out.println("---- 회원 정보 "+str+" ----");
		System.out.print(str+"할 회원 이름 : ");
		return sc.next();
	}

	public void printOneMember(Grade grade) {
		System.out.println("등급 : "+grade.getGrade());
		System.out.println("이름 : "+grade.getName());
		System.out.println("포인트 : "+grade.getPoint());
		System.out.println("보너스 : "+grade.getBonus());
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
		switch(grade) {
		case "silver" :
			g = new Silver(grade, name, point);
			return g;
		case "gold" :
			g = new Gold(grade, name, point);
			return g;
		case "vip" :
			g = new Vip(grade, name, point);
			return g;
		case "vvip" :
			g = new Vvip(grade, name, point);
			return g;
		}
		return g;
	}
	
}
