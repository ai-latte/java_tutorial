package kr.or.iei.point.controller;
import java.util.*;
import kr.or.iei.point.vo.*;
public class PointController {
	private Scanner sc;
	private Silver[] sMembers;
	private int sIndex;
	private Gold[] gMembers;
	private int gIndex;
	private Vip[] vMembers;
	private int vIndex;
	private Vvip[] vvMembers;
	private int vvIndex;
	
	public PointController() {
		sMembers = new Silver[10];
		gMembers = new Gold[10];
		vMembers = new Vip[10];
		vvMembers = new Vvip[10];
		sc = new Scanner(System.in);
	}
	
	public void main() {
		
		
		while(true) {
			System.out.println("===== 회원 관리 프로그램 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 정보 보기");
			System.out.println("3. 선택 회원 정보 보기");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 나가기");
			System.out.print("선택 > ");
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
			default :
				System.out.println("잘못입력하셨습니다");
				break;
			case 0 :
				System.out.println("안녕~");
				return;
			}
		}// while종료
	}//main종료
	
	
	public void insertMember() {
		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("등급 입력 [silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		
		switch(grade) {
		case "silver" :
			sMembers[sIndex] = new Silver(grade, name, point);
			sIndex++;
			break;
		case "gold" :
			gMembers[gIndex] = new Gold(grade, name, point);
			gIndex++;
			break;
		case "vip" :
			vMembers[vIndex] = new Vip(grade, name, point);
			vIndex++;
			break;
		case "vvip" :
			vvMembers[vvIndex] = new Vvip(grade, name, point);
			vvIndex++;
			break;
		default :
			System.out.println("잘못입력하셨습니다");
		}
	}
	
	
	public void printAllMember() {
		System.out.println("===== 회원 정보 전체 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		for(int i=0; i<sIndex; i++) {
			System.out.println(sMembers[i].getGrade()+"\t"+sMembers[i].getName()+"\t"+sMembers[i].getPoint()+"\t"+sMembers[i].getBonus());
		}
		for(int i=0; i<gIndex; i++) {
			System.out.println(gMembers[i].getGrade()+"\t"+gMembers[i].getName()+"\t"+gMembers[i].getPoint()+"\t"+gMembers[i].getBonus());
		}
		for(int i=0; i<vIndex; i++) {
			System.out.println(vMembers[i].getGrade()+"\t"+vMembers[i].getName()+"\t"+vMembers[i].getPoint()+"\t"+vMembers[i].getBonus());
		}
		for(int i=0; i<vvIndex; i++) {
			System.out.println(vvMembers[i].getGrade()+"\t"+vvMembers[i].getName()+"\t"+vvMembers[i].getPoint()+"\t"+vvMembers[i].getBonus());
		}
		System.out.println("------------------------------");
	}
	
	
	
	
	public void printOneMember() {
		System.out.println("===== 선택 회원 정보 보기 =====");
		System.out.print("조회할 회원의 이름을 입력하세요  : ");
		int index[] = searchMember(sc.next());//result 배열을 받아온 것임
		if(index[0] == 0) {
			System.out.println("조회한 회원을 찾을 수 없습니다");
		} else {
			if(index[0] == 1) {
				System.out.println("회원 등급 : "+sMembers[index[1]].getGrade());
				System.out.println("회원 이름 : "+sMembers[index[1]].getName());
				System.out.println("회원 포인트 : "+sMembers[index[1]].getPoint());
				System.out.println("회원 보너스 : "+sMembers[index[1]].getBonus());
			} else if(index[0] == 2) {
				System.out.println("회원 등급 : "+gMembers[index[1]].getGrade());
				System.out.println("회원 이름 : "+gMembers[index[1]].getName());
				System.out.println("회원 포인트 : "+gMembers[index[1]].getPoint());
				System.out.println("회원 보너스 : "+gMembers[index[1]].getBonus());
			} else if(index[0] == 3) {
				System.out.println("회원 등급 : "+vMembers[index[1]].getGrade());
				System.out.println("회원 이름 : "+vMembers[index[1]].getName());
				System.out.println("회원 포인트 : "+vMembers[index[1]].getPoint());
				System.out.println("회원 보너스 : "+vMembers[index[1]].getBonus());
			} else if(index[0] == 4) {
				System.out.println("회원 등급 : "+vvMembers[index[1]].getGrade());
				System.out.println("회원 이름 : "+vvMembers[index[1]].getName());
				System.out.println("회원 포인트 : "+vvMembers[index[1]].getPoint());
				System.out.println("회원 보너스 : "+vvMembers[index[1]].getBonus());
			}
		}
		
	}
	
	public void updateMember() {
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 학생 이름 입력 : ");
		int[] index = searchMember(sc.next());
		// [][] 배열이 들어와 있음
		if(index[0] == 0) {
			System.out.println("잘못입력하셨습니다");
		} else {
			if(index[0]==1) {
				for(int i=index[1]; i<sIndex-1; i++) {
					sMembers[i] = sMembers[i+1];
				}
				sIndex--;
			} else if(index[0]==2) {
				for(int i=index[1]; i<gIndex-1; i++) {
					gMembers[i] = gMembers[i+1];
				}
				gIndex--;
			} else if(index[0]==3) {
				for(int i=index[1]; i<vIndex-1; i++) {
					vMembers[i] = vMembers[i+1];
				}
				vIndex--;
			} else if(index[0]==4) {
				for(int i=index[1]; i<vvIndex-1; i++) {
					vvMembers[i] = vvMembers[i+1];
			}
			}
		}// 삭제 완료
		
		System.out.print("등급 입력 [silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		
		switch(grade) {
		case "silver" :
			sMembers[sIndex] = new Silver(grade, name, point);
			sIndex++;
			break;
		case "gold" :
			gMembers[gIndex] = new Gold(grade, name, point);
			gIndex++;
			break;
		case "vip" :
			vMembers[vIndex] = new Vip(grade, name, point);
			vIndex++;
			break;
		case "vvip" :
			vvMembers[vvIndex] = new Vvip(grade, name, point);
			vvIndex++;
			break;
		default :
			System.out.println("잘못입력하셨습니다");
		}
		
		System.out.println("변경이 완료되었습니다");
	}
	
	
	
	public void deleteMember() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제할 회원 이름 입력 : ");
		int[] index = searchMember(sc.next());
		if(index[0]==-1) {
			System.out.println("회원을 찾을 수 없습니다");
		} else {
			if(index[0]==1) {
				for(int i=index[1]; i<sIndex-1; i++) {
				sMembers[i] = sMembers[i+1];
				}
				sIndex--;
			} else if(index[0]==2) {
			for(int i=index[1]; i<gIndex-1; i++) {
				gMembers[i] = gMembers[i+1];
			}
			gIndex--;
			} else if(index[0]==3) {
			for(int i=index[1]; i<vIndex-1; i++) {
				vMembers[i] = vMembers[i+1];
			}
			vIndex--;
			} else if(index[0]==4) {
			for(int i=index[1]; i<vvIndex-1; i++) {
				vvMembers[i] = vvMembers[i+1];
			}
			}
		}
		System.out.println("삭제가 완료되었습니다");
	}	
	
	
	
	// 앞에는 뭐냐 등급
	// 뒤에 i를 넣어서 인덱스 표시
	public int[] searchMember(String name) {
		int[] result = new int[2];
		for(int i=0; i<sIndex; i++) {
			if(name.equals(sMembers[i].getName())) {
				result[0] = 1;
				result[1] = i;
				return result;
			}
		}
		for(int i=0; i<gIndex; i++) {
			if(name.equals(gMembers[i].getName())) {
				result[0] = 2;
				result[1] = i;
				return result;
			}
		}
		for(int i=0; i<vIndex; i++) {
			if(name.equals(vMembers[i].getName())) {
				result[0] = 3;
				result[1] = i;
				return result;
			}
		}
		for(int i=0; i<vvIndex; i++) {
			if(name.equals(vvMembers[i].getName())) {
				result[0] = 4;
				result[1] = i;
				return result;
			}
		}
		
		return result;
	}
}
