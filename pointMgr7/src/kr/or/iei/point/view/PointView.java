package kr.or.iei.point.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointView {
	private Scanner sc;
	
	
	
	public PointView() {
		super();
		sc = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	public int showMenu() {
		System.out.println("---- 회원관리프로그램 ----");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 전체 출력");
		System.out.println("3. 회원 정보 1명 출력");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("0. 나가기");
		System.out.print("선택 > > > >");
		return sc.nextInt();
	}

	public Grade insertMember() {
		System.out.println("---- 회원 정보 등록 ----");
		System.out.print("회원 등급 입력 silver/gold/vip/vvip : ");
		String grade = (sc.next()).toLowerCase();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		sc.nextLine();
		int point = sc.nextInt();
		Grade newMember = null; // 추상클래스 객체생성안됨 선언만 해둔 것임
		switch(grade) {
		case "silver" :
			newMember = new Silver(grade, name, point);
			return newMember;
		case "gold" :
			newMember = new Gold(grade, name, point);
			return newMember;
		case "vip" :
			newMember = new Vip(grade, name, point);
			return newMember;
		case "vvip" :
			newMember = new Vvip(grade, name, point);
			return newMember;
			
		}
		return null;
	}

	public void printAllMember(HashMap<String, Grade> members) {
		System.out.println("---- 전체 회원 출력 ----");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("------------------------");
		// 멤버라는 맵이 넘어왔음
		Set<String> keys = members.keySet(); // keys라는 key의 집합이 만들어짐
		for(String key : keys) {
			Grade g = members.get(key); //get(인덱스)처럼 get(key)
			System.out.print(g.getGrade()+"\t");
			System.out.print(g.getName()+"\t");
			System.out.print(g.getPoint()+"\t");
			System.out.print(g.getBonus()+"\t");
			System.out.println();
		}
		
	}

	public String getName(String str) {
		System.out.println("---- 회원 정보 "+str+"----");
		System.out.print(str+"할 회원 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void noSearchMember() {
		System.out.println("회원을 찾을 수 없습니다");
	}

	public void printOneMember(Grade g) {
		System.out.println("회원 등급 : "+g.getGrade());
		System.out.println("회원 이름 : "+g.getName());
		System.out.println("회원 포인트 : "+g.getPoint());
		System.out.println("회원 보너스 : "+g.getBonus());
	}

	public Grade updateMember() {
		System.out.print("수정할 회원 등급 입력 : ");
		String grade = sc.next().toLowerCase();
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정할 회원 포인트 입력 : ");
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
		return null;
	}
	
	
}
