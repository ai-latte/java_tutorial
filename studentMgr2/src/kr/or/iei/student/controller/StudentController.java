package kr.or.iei.student.controller;
import kr.or.iei.student.vo.Student;
import java.util.Scanner;
public class StudentController {

	private Student[] students;
	private Scanner sc;
	private int index;
	
	public StudentController() {
		super();
		students = new Student[10];
		sc = new Scanner(System.in);
		index = 0;
	}
	
	public void main() {
		while(true) {
			System.out.println("\n-------학생관리 프로그램v2-------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력 (전체 학생 정보)");
			System.out.println("3. 학생 정보 출력 (이름으로 검색)");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
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
			case 0 :
				System.out.println(" 시스템을 종료합니다 ");
				return;
			default :
				System.out.println(" 잘못입력하셨습니다 ");
			}
		}
	}	
	
	public void insertStudent() {
		System.out.println("\n-------학생 정보 등록-------\n");
		System.out.print("등록할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		// 1) 기본생성자
		/*
		Student s = new Student();
		// 비어 있는 학생 인스턴스 생성
		s.setName(name);
		s.setAge(age);
		s.setAddr(addr);
		*/
		
		// 2) 매개변수 있는 생성자
		Student s = new Student(name, age, addr);
		students[index++] = s;
		System.out.println("학생 정보 등록 완료");
	}

	
	
	public void printAllStudent() {
		System.out.println("\n-----모든 학생 정보 출력 -----\n");
		System.out.println("이름:\t나이:\t주소:\t");
		System.out.println("---------------------------");
		// students  > 배열타입
		// Students[인덱스번호]  > Student타입
		// Students[인덱스번호].getter 호출		
		for(int i=0; i<index; i++) {
			System.out.println(students[i].getName()+"\t"
							  +students[i].getAge()+"\t"
							  +students[i].getAddr());
		}
	}

	public void printOneStudent() {
		System.out.println("\n------- 학생 정보 출력 -------\n");
		System.out.print("조회할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex==-1) {
			System.out.println("입력한 학생 정보를 찾을 수 없습니다");
		} else {
			System.out.println("학생 이름 : "+students[searchIndex].getName());
			System.out.println("학생 나이 : "+students[searchIndex].getAge());
			System.out.println("학생 주소 : "+students[searchIndex].getAddr());
		}
	}
	
	
	public void updateStudent() {
		System.out.println("\n------- 학생 정보 수정 -------\n");
		System.out.print("변경할 학생 이름 입력 : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex==-1) {
			System.out.println("회원을 찾을 수 없습니다");
		} else {
			System.out.print("변경할 이름 : ");
			String updateName = sc.next();
			System.out.print("변경할 나이 : ");
			int updateAge = sc.nextInt();
			System.out.print("변경할 주소 : ");
			String updateAddr = sc.next();
			Student s = students[searchIndex];
			s.setName(updateName);
			s.setAge(updateAge);
			s.setAddr(updateAddr);
			System.out.println("정보 수정 완료 !");
		}
	}
	
	
	public void deleteStudent() {
		System.out.println("\n------- 학생 정보 삭제 -------\n");
		System.out.print("삭제할 학생의 이름을 입력해 주세요 : ");
		int searchIndex = searchStudent(sc.next());
		if(searchIndex==-1) {
			System.out.println("조회한 학생을 찾을 수 없습니다");
		} else {
			for(int i=searchIndex; i<index-1; i++) {
				students[i] = students[i+1];
			}
			index--;
			System.out.println("정보 삭제 완료");
		}
	}
	
	public int searchStudent(String searchName) {
		for (int i=0; i<index; i++) {
			if(searchName.equals(students[i].getName())) {
				return i;
			}
		}	return -1;
	}
	
	
}//클래스 종료