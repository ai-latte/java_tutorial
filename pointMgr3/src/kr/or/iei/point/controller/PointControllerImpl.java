package kr.or.iei.point.controller;
import java.util.Scanner;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointControllerImpl implements PointController {
	// 추상메서드 구현할 때까지 오류
	
	/*
	 Silver 객체 저장용 배열, Gold, Vip, Vvip 객체 저장용 배열
	 == grade 배열 1개로 가능
	 각 배열의 인덱스 관리용 변수
	 Scanner
	 */
	
	private Grade[] members;
	private int index;
	private Scanner sc;
	
	public PointControllerImpl() {
		super();
		members = new Grade[40];
		sc = new Scanner(System.in);
	}
	
	@Override
	public void main() {
		while(true) {
			System.out.println("====== 회원 관리 프로그램 ======");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 보기");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 나가기");
			System.out.print("선택 >>>  ");
			int sel = sc.nextInt();
			
			
			switch(sel) {
			case 1 :
				insertMember();
				break;
			case 2 :
				printAllMember();
				break;
			case 3 : 
				printOneMember();
				break;
			case 4 :
				updateMember();
				break;
			case 5 :
				deleteMember();
				break;
			case 0 :
				System.out.println("안녕히 가세요");
				return;
			default :
				System.out.println("잘못입력하셨씁니다");
				break;
			}
		}
		
	}

	@Override
	public void insertMember() {
		System.out.println("====== 회원 정보 등록 =======");
		System.out.print("회원 등급 입력 [silver, gold, vip. vvip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		
		// 객체가 다르기 때문에 필요함
		switch(grade) {
		case "silver" :
			Silver s = new Silver(grade, name, point);
			Grade newMember = (Grade)s; //grade 변수에 업캐스팅 해서 넣어주고
			members[index] = newMember;
			index++;
			break;
		case "gold" :
			Gold g = new Gold(grade, name, point);
			Grade newMember2 = (Grade)g;
			members[index++] = newMember2;
			break;
		case "vip" :
			Grade newMember3 = new Vip(grade, name, point);
			members[index++] = newMember3;
			break;
		case "vvip" :
			members[index++] = new Vvip(grade, name, point);
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
		}
		System.out.println(" 회원 등록 완료 ");
	}

	@Override
	public void printAllMember() {
		System.out.println("====== 전체 회원 출력 ======");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("--------------------------");
		for(int i=0; i<index; i++) {
			Grade g = members[i];
			System.out.print(g.getGrade()+"\t");
			System.out.print(g.getName()+"\t");
			System.out.print(g.getPoint()+"\t");
			System.out.print(g.getBonus()+"\t");
			System.out.println();
		}
	}

	@Override
	public void printOneMember() {
		System.out.println("====== 조회 회원 출력 ======");
		System.out.print("조회할 회원 이름 입력 :  ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("조회한 회원을 찾을 수 없습니다");
		} else {
			System.out.println("등급 :\t"+members[searchIndex].getGrade());
			System.out.println("이름 :\t"+members[searchIndex].getName());
			System.out.println("포인트 :\t"+members[searchIndex].getPoint());
			System.out.println("보너스 :\t"+members[searchIndex].getBonus());
		}
	}

	@Override
	public void updateMember() {
		System.out.println("======= 회원 정보 수정 ======");
		System.out.print("수정할 회원 이름 입력 : ");
		int searchIndex = searchMember(sc.next());
		// 객체를 바꿔줘야 함
		if(searchIndex==-1) {
			System.out.println("조회한 회원을 찾을 수 없습니다");
		} else {
			System.out.print("변경할 등급 : ");
			String grade = sc.next();
			System.out.print("변경할 이름 : ");
			String name = sc.next();
			System.out.print("변경할 포인트 : ");
			int point = sc.nextInt();
			switch(grade) {
			case "silver" :
				members[searchIndex] = new Silver(grade, name, point);
				break;
			case "gold" :
				members[searchIndex] = new Gold(grade, name, point);
			 	break;
			case "vip"	:
				members[searchIndex] = new Vip(grade, name, point);
				break;
			case "vvip" :
				members[searchIndex] = new Vvip(grade, name, point);
				break;
			}
		}
	}
	

	@Override
	public void deleteMember() {
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("삭제할 회원 이름 입력 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("조회한 회원을 찾을 수 없습니다");
		} else {
			for (int i=searchIndex; i<index-1; i++) {
				members[i] = members[i+1];
		}
			index--;
		System.out.println(" 삭제 완료 ");
		}
	}

	@Override
	public int searchMember(String name) {
		for(int i=0; i<index; i++) {
			if(members[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

}
