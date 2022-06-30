package kr.or.iei.student.controller;
import java.util.Scanner;
public class StudentController {
	//학생정보를 관리하는 프로그램 (10명)
	//학생정보 : 이름, 나이, 주소
	//단, 동명이인은 없음 (가정), 데이터는 정상적으로 입력된다
	private String[] name;
	private int[] age;
	private String[] addr;
	private Scanner sc;
	private int index; //학생정보추가시 학생정보가 들어갈 배열 위치를 저장할 변수)
	
	public StudentController() {
		name = new String[10];
		age = new int[10];
		addr = new String[10];
		sc = new Scanner(System.in);
		index = 0;
	}
	
	//최초 실행메소드(메뉴 제공)
	public void main() {
		while(true) {
			System.out.println("\n-------학생관리 프로그램v1-------\n");
			System.out.println("1. 학생 정보 등록"); // Create : 데이터를 만들어 저장하는 기능
			System.out.println("2. 학생 정보 출력 (전체 학생 정보)");
			System.out.println("3. 학생 정보 출력 (이름으로 검색)"); // read : 저장되어 있는 데이터를 읽어오는 기능
			System.out.println("4. 학생 정보 수정"); // update : 저장되어 있는 데이터를 수정하는 기능
			System.out.println("5. 학생 정보 삭제"); // delete : 저장되어 있는 데이터를 삭제
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1 : 
				insertStudent();
				break;
			case 2 :
				printAllStudent();
				break;
			case 3 :
				printOneStudent();
				break;
			case 4 :
				updateStudent();
				break;
			case 5 :
				deleteStudent();
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			case 0 :
				System.out.println("- 시스템을 종료합니다 -");
				return;
			}
		} // while 종료
	} //main() 종료
	
	
	//학생정보를 입력받아 배열에 저장하는 메서드
	public void insertStudent() {
		System.out.println("\n------- 학생 정보 등록 -------\n");
		System.out.print("학생 이름 입력 : ");
		String StudentName = sc.next();
		System.out.print("학생 나이 입력 : ");
		int studentAge = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String StudentAddr = sc.nextLine();
		name[index] = StudentName;
		age[index] = studentAge;
		addr[index] = StudentAddr;
		index++;
	}
	
	// 배열에 저장된 모든 학생정보를 출력하는 메서드
	// 인덱스는 배열에 들어있는 정보에서 1을 추가한 배열을 가리킨다
	// 인덱스는 학생수와 동일하다 (등록할 때마다 1이 추가된 상태이기 때문에)
	public void printAllStudent() {
		System.out.println("\n----- 전체 학생 정보 출력 -----\n");
		System.out.println("이름\t나이\t주소");
		for(int i=0; i<index; i++) {
			System.out.println(name[i]+"\t"+age[i]+"\t"+addr[i]);
		}
	}
	
	// 이름을 입력받아 조회 후 배열에 저장된 해당 학생정보를 출력하는 메서드
	public void printOneStudent() {
		System.out.println("\n----- 학생 정보 출력 (이름 검색) -----\n");
		System.out.print("조회할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex==-1) {
			System.out.println("학생정보를 조회할 수 없습니다");
		} else {
			System.out.println("학생이름 : "+name[searchIndex]);
			System.out.println("학생나이 : "+age[searchIndex]);
			System.out.println("학생주소 : "+addr[searchIndex]);
		}
	}
	
	
	
	// 학생이름을 입력받아 해당 학생의 정보를 수정하는 메서드
	public void updateStudent() {
		System.out.println("\n------- 학생 정보 수정 -------\n");
		System.out.print("정보를 수정할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex==-1) {
			System.out.println("학생정보를 조회할 수 없습니다");
		} else {
			System.out.print("수정할 이름 입력 : ");
			name[searchIndex] = sc.next();
			System.out.print("수정할 나이 입력 : ");
			age[searchIndex] = sc.nextInt();
			System.out.print("수정할 주소 입력 : ");
			sc.nextLine(); //버퍼에 남은 엔터 제거
			addr[searchIndex] = sc.nextLine();
			System.out.println("정보 수정 완료 !");
		}
	}
	
	// 이름을 입력받아 해당 학생을 삭제하는 메서드
	public void deleteStudent() {
		System.out.println("\n------- 학생 정보 삭제 -------\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("학생 정보를 찾을 수 없습니다.");
		} else {
			for(int i=searchIndex; i<index-1; i++) {
				name[i] = name[i+1];
				age[i] = age[1+1];
				addr[i] = addr[i+1];
			}
			index--; // 마지막 칸을 컨트롤 < 어차피 인덱스만큼 출력하니까
			System.out.println("- 삭제 완료 ! -");
			// 예를 들면, 회원이 5명 인덱스 번호 0~4번 index : 5개
			// 3번회원 삭제 > 2번 인덱스 데이터 삭제
			// 3번부터 하나씩 당겨오겠다
			// 2번 : 3번 데이터 입력
			// 3번 : 4번 데이터 입력
			// 한 명 사라졌으니 인덱스 -1
		}
	}
	

	
	// 매개변수로 받은 이름이 name배열의 몇 번째 존재하는지 index를 돌려주는 메서드
	// (조회 실패시 -1 반환)
	public int searchStudent(String searchName) {
		for(int i=0; i<index; i++) {
			if(searchName.equals(name[i])) {
				return i;
			}
		} return -1;
	}
	
	
} //class 종료