package kr.or.iei.point.controller;
import kr.or.iei.point.vo.Silver;
import java.util.Scanner;
public class PointController {
	
	Silver[] silverMember;
	Scanner sc;
	int index;
	double bonus;
	
	public PointController() {
		silverMember = new Silver[10];
		sc = new Scanner(System.in);
		index = 0;
		bonus = 0;
	}
	
	public void main() {
		while(true) {
		System.out.println("====== 포인트 관리 프로그램v1 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 전체 회원 조회");
		System.out.println("3. 회원 1명 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 :
			insertMenber();
			break;
		case 2 :
			printAllSilverMember();
			break;
		case 3 :
			printOneSilverMember();
			break;
		case 4 :
			updateSilvermember();
			break;
		case 5 :
			deleteSilverMember();
			break;
		case 0 :
			System.out.println("프로그램을 종료합니다");
			return;
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		}
	}
	
	
	public void insertMenber() {
		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("회원 등급 입력 : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		Silver s = new Silver(grade, name, point);
		silverMember[index] = s;
		index++;
		System.out.println("회원 정보 입력 완료 !");
	}
	
	
	public void printAllSilverMember() {
		System.out.println("====== 전체 회원 출력 ======");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-------------------------");
		for(int i=0; i<index; i++) {
			System.out.println(silverMember[i].getGrade()+"\t"+silverMember[i].getName()+"\t"+silverMember[i].getPoint()+"\t"+silverMember[i].getBonus());
		}
	}

	
	public void printOneSilverMember() {
		System.out.println("====== 회원 정보 출력 ======");
		System.out.print("조회할 회원 이름 입력 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			System.out.println("회원 등급  : "+silverMember[searchIndex].getGrade());
			System.out.println("회원 이름  : "+silverMember[searchIndex].getName());
			System.out.println("회원 포인트 : "+silverMember[searchIndex].getPoint());
			System.out.println("회원 보너스 : "+silverMember[searchIndex].getBonus());
		}
	}
	
	
	public void updateSilvermember() {
		System.out.println("====== 회원 정보 출력 ======");
		System.out.print("조회할 회원 이름 입력 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			System.out.print("변경할 등급 입력  : ");
			silverMember[searchIndex].setGrade(sc.next());
			System.out.print("변경할 이름 입력  : ");
			silverMember[searchIndex].setName(sc.next());
			System.out.print("변경할 포인트 입력 : ");
			silverMember[searchIndex].setPoint(sc.nextInt());
			System.out.println("\n정보 수정이 완료되었습니다.");
		}
	}
	
	
	public void deleteSilverMember() {
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("조회할 회원 이름 입력 : ");
		int searchIndex = searchMember(sc.next());
		if(searchIndex==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			for(int i=searchIndex; i<index-1; i++) {
				silverMember[i] = silverMember[i+1];
			} index--;
			System.out.println(" 삭제 완료 ");
		}
	}
	
	
	public int searchMember(String name) {
		for(int i=0; i<index; i++) {
			if(name.equals(silverMember[i].getName())) {
				return i;
			} 
		} return -1;
	}
	
	
	
}