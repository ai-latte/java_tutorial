package kr.or.student.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.or.student.vo.Student;

public class StudentView {
	private Scanner sc;
	
	
	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("---- 학생관리 프로그램v5 -----");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 정보 전체 출력");
		System.out.println("3. 학생 정보 1명 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 나가기");
		System.out.print("선택 > > > ");
		return sc.nextInt();
	}

	public Student insertStudent() {
		System.out.print("---- 학생 정보 등록 ----");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.next();
		Student s = new Student (name, age, addr);
		return s;
	}

	public void printAllStudent(HashMap<String, Student> students) {
		System.out.print("---- 학생 정보 전체 출력 ----");
		System.out.println("이름\t나이\t주소\t");
		Set<String> names = students.keySet();
		for(String name : names) {
			Student s = students.get(name);
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getAddr()+"\t");
			System.out.println();
		}
	}

	public String getName(String str) {
		System.out.print("---- 학생 정보 1명 출력 ----");
		System.out.print(str+"할 이름 입력 : ");
		String name = sc.next();
		return name;
	}


	public void noSearchStudent() {
		System.out.println("학생정보를 찾을 수 없습니다.");
	}

	public void printOneStudent(Student s) {
		System.out.println("이름 : "+s.getName());
		System.out.println("나이 : "+s.getAge());
		System.out.println("주소 : "+s.getAddr());
	}

	public Student updateStudent() {
		System.out.print("수정 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("수정 주소 입력 : ");
		String addr = sc.next();
		Student s = new Student(name, age, addr);
		return s;
	}
	
	
}
