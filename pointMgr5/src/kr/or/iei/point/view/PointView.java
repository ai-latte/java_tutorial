package kr.or.iei.point.view;
import kr.or.iei.point.vo.*;
import java.util.Scanner;
public class PointView {
	
	Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		System.out.println("회원 관리 프로그램");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 전체 출력");
		System.out.println("3. 조회 회원 출력");
		System.out.println("4. 조회 회원 수정");
		System.out.println("5. 조회 회원 삭제");
		System.out.println("0. 나가기");
		System.out.print("선택 >>> ");
		return sc.nextInt();
	}
	
	public String returnGrade(String str) {
		System.out.println("====== 회원 정보 "+str+" ======");
		System.out.print("등급 입력 [silver/gold/vip/vvip]: ");
		String grade = sc.next();
		return grade;
	}
	
	public void insertNamePoint(Grade g) {
		System.out.print("이름 입력 : ");
		g.setName(sc.next());
		System.out.print("포인트 입력 : ");
		g.setPoint(sc.nextInt());
	}
	
	public void printAllmember(int index, Grade[] g) {
		System.out.println("====== 전체 회원 출력 ======");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i=0; i<index; i++) {
			System.out.print(g[i].getPoint()+"\t");
			System.out.print(g[i].getName()+"\t");
			System.out.print(g[i].getPoint()+"\t");
			System.out.print(g[i].getBonus()+"\t");
			System.out.println();
		}
	}
	
	public String getName(String str) {
		System.out.println("====== 회원 정보 "+str+" ======");
		System.out.print(str+"할 이름 입력 : ");
		return sc.next();
	}
	
	
	public void noSearchMember() {
		System.out.println("회원을 조회할 수 없습니다.");
	}

	public void printOneMember(Grade g) {
		System.out.println("등급 : "+g.getGrade());
		System.out.println("이름 : "+g.getName());
		System.out.println("포인트 : "+g.getPoint());
		System.out.println("보너스 : "+g.getBonus());
	}
	
	public void success(String str) {
		System.out.println(str+" 완료 !");
	}
	
	
}