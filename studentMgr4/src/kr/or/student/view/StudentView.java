package kr.or.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.student.vo.Student;

public class StudentView {
	
	private Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===== 학생 관리 프로그램 =====");
		System.out.println("1. 학생 정보 등록 ");
		System.out.println("2. 학생 정보 전체 출력 ");
		System.out.println("3. 학생 정보 1명 출력 ");
		System.out.println("4. 학생 정보 수정 ");
		System.out.println("5. 학생 정보 삭제 ");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > > >   ");
		return sc.nextInt();
	}

	public Student insertStudent() {
		System.out.println("---- 학생 정보 등록 -----");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		sc.nextLine();
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		String addr = sc.next();
		Student s = new Student(name, age, addr);
		return s;
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("---- 전체 학생 출력 ----");
		System.out.println("이름\t나이\t주소\t");
//		for(int i=0; i<students.size(); i++) {
//			Student s = students.get(i);
//			System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddr());
//		}
		for(Student s : students) { //s를 꺼내는 것이기 때문에
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getAddr()+"\t");
			System.out.println();
		}	
	}
	
	public void success(String str) {
		System.out.println(str+" 완료 !");
	}

	public String getName(String str) {
		System.out.println("---- 회원 정보 "+str+" ----");
		System.out.print(str+"할 학생 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void noSearchStudent() {
		System.out.println("학생 정보를 찾을 수 없습니다");
	}

	public void printOneStudent(Student s) {
		System.out.println("이름 : "+s.getName());
		System.out.println("나이 : "+s.getAge());
		System.out.println("주소 : "+s.getAddr());
	}

	public Student updateStudent() {
		Student s = new Student();
		System.out.print("수정할 이름 입력 : ");
		s.setName(sc.next());
		System.out.print("수정할 나이 입력 : ");
		s.setAge(sc.nextInt());
		System.out.print("수정할 주소 입력 : ");
		sc.nextLine();
		s.setAddr(sc.next());
		return s;
	}

	
}
