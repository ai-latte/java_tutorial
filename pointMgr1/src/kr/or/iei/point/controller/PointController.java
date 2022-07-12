package kr.or.iei.point.controller;
import kr.or.iei.point.vo.*;
import java.util.Scanner;
public class PointController {
	
	private Silver[] sMembers;
	private int sIndex; // 자동 0으로 초기화
	private Gold[] gMembers;
	private int gIndex;
	private Vip[] vMembers;
	private int vIndex;
	private Scanner sc;
	private int flag;
	
	public PointController() {
		sMembers = new Silver[10];
		gMembers = new Gold[10];
		vMembers = new Vip[10];
		sc = new Scanner(System.in);
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
			System.out.println("프로그램을 종료합니다");
			return;
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		}
	}
	
	
	public void insertMember() {
		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("회원 등급 입력 [silver/gold/vip]: ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch(grade) {
		case "silver" :
			Silver s = new Silver(grade, name, point);
			sMembers[sIndex] = s;
			sIndex++;
			break;
		case "gold" :
			Gold g = new Gold(grade, name, point);
			gMembers[gIndex] = g;
			gIndex++;
			break;
		case "vip" :
			Vip v = new Vip(grade, name, point);
			vMembers[vIndex] = v;
			vIndex++;
			break;
		}
		System.out.println("회원 정보 입력 완료 !");
	}
	
	
	public void printAllMember() {
		System.out.println("======== 전체 회원 출력 ========");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");
		for(int i=0; i<sIndex; i++) {
			System.out.println(sMembers[i].getGrade()+"\t"+sMembers[i].getName()+"\t"+sMembers[i].getPoint()+"\t"+sMembers[i].getBonus());
		}
		for(int i=0; i<gIndex; i++) {
			System.out.println(gMembers[i].getGrade()+"\t"+gMembers[i].getName()+"\t"+gMembers[i].getPoint()+"\t"+gMembers[i].getBonus());
		}
		for(int i=0; i<vIndex; i++) {
			System.out.println(vMembers[i].getGrade()+"\t"+vMembers[i].getName()+"\t"+vMembers[i].getPoint()+"\t"+vMembers[i].getBonus());
		}
	}

	
	public void printOneMember() {
		System.out.println("====== 회원 정보 출력 ======");
		System.out.print("조회할 회원 이름 입력 : ");
		int searchIndex = searchMember1(sc.next());
		if(searchIndex==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			if((searchIndex/100) == 1) { //silver
			searchIndex-=100;
			System.out.println("회원 등급  : "+vMembers[searchIndex].getGrade());
			System.out.println("회원 이름  : "+vMembers[searchIndex].getName());
			System.out.println("회원 포인트 : "+vMembers[searchIndex].getPoint());
			System.out.println("회원 보너스 : "+vMembers[searchIndex].getBonus());
			} else if(searchIndex/10==1) {
			searchIndex-=10;
			System.out.println("회원 등급  : "+gMembers[searchIndex].getGrade());
			System.out.println("회원 이름  : "+gMembers[searchIndex].getName());
			System.out.println("회원 포인트 : "+gMembers[searchIndex].getPoint());
			System.out.println("회원 보너스 : "+gMembers[searchIndex].getBonus());
			} else { 
			System.out.println("회원 등급  : "+sMembers[searchIndex].getGrade());
			System.out.println("회원 이름  : "+sMembers[searchIndex].getName());
			System.out.println("회원 포인트 : "+sMembers[searchIndex].getPoint());
			System.out.println("회원 보너스 : "+sMembers[searchIndex].getBonus());
			}
		}
	}
	
	
	// searchIndex3번 사용
	// [0][0] 조회X [1][i] silver [2][i] gold [3][i] vip
	// 객체가 바뀌어야 보너스도 바뀐다
	public void updateMember() {
		System.out.println("======== 회원 정보 수정 ========");
		System.out.print("수정할 회원 이름 입력 : ");
		int[] result = searchMember3(sc.next());
		if(result[0] == 0) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			if(result[0] == 1) { // silver // 삭제 먼저 해주고
				for(int i=result[1]; i<sIndex-1; i++) {  // result[1] == silver의 인덱스
					sMembers[i] = sMembers[i+1];
				}
			} else if(result[0] == 2) {
				for(int i=result[1]; i<gIndex-1; i++) {
					gMembers[i] = gMembers[i+1];
				}
			}else if(result[0] == 3) {
				for(int i=result[1]; i<vIndex-1; i++) {
					vMembers[i] = vMembers[i+1];
			}
			System.out.println("삭제 완료");
			// 새로운 등급의 객체를 받는다
			System.out.print("변경할 등급 입력 : ");
			String grade = sc.next();
			System.out.print("변경할 이름 입력  : ");
			String updateName = sc.next();
			System.out.print("변경할 포인트 입력 : ");
			int point = sc.nextInt();
			switch(grade) {
				case "silver" :
					Silver s = new Silver(grade, updateName, point);
					sMembers[sIndex] = s;
					sIndex++;
					break;
				case "gold" :
					Gold g = new Gold(grade, updateName, point);
					gMembers[gIndex++] = g;
					break;
				case "vip" :
					vMembers[vIndex++] = new Vip(grade, updateName, point);
					break;
				}
			}
		}
		
	}
	
	
	
	public void deleteMember() {
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("조회할 회원 이름 입력 : ");
		int searchIndex = searchMember2(sc.next());
		if(searchIndex==-1) {
			System.out.println("해당 회원을 찾을 수 없습니다.");
		} else {
			if(flag == 1) {
				for(int i=searchIndex; i<sIndex-1; i++) {
					sMembers[i] = sMembers[i+1];
				}
				sIndex--;
			}else if(flag == 2) {
				for(int i=searchIndex; i<gIndex-1; i++) {
					gMembers[i] = gMembers[i+1];
				}
				gIndex--;
			}else if(flag == 3) {
				for(int i=searchIndex; i<vIndex-1; i++) {
					vMembers[i] = vMembers[i+1];
				}
				vIndex--;
			}
			System.out.println(" 삭 제 완 료 ! ");
		}
	}
	
	
	
	// 1) 1~9 / 10~19 / 100~109확장성 없음 사용 안 함
	public int searchMember1(String name) {
		for(int i=0; i<sIndex; i++) {
			if(name.equals(sMembers[i].getName())) {
				return i;
			}
		}
		for(int i=0; i<gIndex; i++) {
			if(name.equals(gMembers[i].getName())) {
					return i+10;
				}
		}
				
		for(int i=0; i<vIndex; i++) {
				if(name.equals(vMembers[i].getName())) {
					return i+100;
				} 
		} return -1;
	}
	
	
	// 2) 신호를 주는 방법
	public int searchMember2(String name) {
		for(int i=0; i<sIndex; i++) {
			if(name.equals(sMembers[i].getName())) {
				flag = 1;
				return i;
			}
		}
		for(int i=0; i<gIndex; i++) {
			if(name.equals(gMembers[i].getName())) {
				flag = 2;
				return i;
				}
		}
				
		for(int i=0; i<vIndex; i++) {
			if(name.equals(vMembers[i].getName())) {
				flag = 3;
				return i;
				} 
		} return -1;
	}


	// 3) 배열 리턴
	// 0번 인덱스는 어떤 배열인지 / 1번 인덱스는 몇 번 인덱스인지
	public int[] searchMember3(String name) {
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
		} return result;
	}



}