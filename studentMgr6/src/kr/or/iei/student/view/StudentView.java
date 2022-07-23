package kr.or.iei.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.student.vo.Student;

public class StudentView {
	private Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int getSel() {
		System.out.println("---- 학생 관리 프로그램 -----");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 정보 전체 보기");
		System.out.println("3. 학생 정보 1명 조회");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print(" 선택 >>> ");
		int sel = sc.nextInt();
		return sel;
	}

	public Student insertStudent() {
		System.out.println("--- 학생 정보 등록 ---");
		System.out.print("학생 이름 등록 : ");
		String name = sc.next();
		System.out.print("학생 주소 등록 : ");
		String addr = sc.next();
		System.out.print("학생 나이 등록 : ");
		sc.nextLine();
		int age = sc.nextInt();
		Student s = new Student(name, addr, age);
		return s;
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("--- 학생 정보 전체 출력 ----");
		System.out.println("이름\t나이\t주소");
		for (Student s : students) {
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getAddr()+"\t");
			System.out.println();
		}
	}

	public String checkStudent(String str) {
		System.out.println("--- 학생 정보 "+str+" ---");
		System.out.print(str+"할 학생 이름 입력 : ");
		return sc.next();
	}

	public void noSearchStudent() {
		System.out.println("조회한 학생을 찾을 수 없습니다.");		
	}

	public void printOneStudent(Student s) {
		System.out.println("학생 이름 : "+s.getName());
		System.out.println("학생 나이 : "+s.getAge());
		System.out.println("학생 주소 : "+s.getAddr());
	}

	public void updateStudent(Student s) {
		System.out.print("수정할 학생 이름 등록 : ");
		s.setName(sc.next());
		System.out.print("수정할 학생 주소 등록 : ");
		s.setAddr(sc.next());
		System.out.print("수정할 학생 나이 등록 : ");
		sc.nextLine();
		s.setAge(sc.nextInt());
	}
	
	
	
}
