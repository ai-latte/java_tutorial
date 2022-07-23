package kr.or.iei.student.view;
import java.util.Scanner;
import kr.or.iei.student.vo.Student;
public class StudentView {
	Scanner sc = new Scanner(System.in);
	//사용자에게 보여주고
	// 선택값을 받아서 
	// return 해준다
	public int showMenu() {
		System.out.println("====== 학생 관리 프로그램 ======");
		System.out.println("1. 학생 정보 등록 ");
		System.out.println("2. 전체 학생 정보 보기 ");
		System.out.println("3. 조회 학생 정보 보기 ");
		System.out.println("4. 학생 정보 수정 ");
		System.out.println("5. 학생 정보 삭제 ");
		System.out.println("0. 프로그램 종료 ");
		System.out.print("선택 > > > ");
		int sel = sc.nextInt();
		return sel;
	}
	
	public Student insertStudent() { // Student 타입 객체 반환
		System.out.println("====== 학생 정보 등록 ======");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.next();
		Student s = new Student(name, age, addr);
		return s;
	}
	
	public void Success(String str) {
		System.out.println("회원 "+str+" 완료 !");
	}
	
	
	public void printAllSrudent(Student[] students, int index) {
		System.out.println("====== 전체 학생 출력 =======");
		System.out.println("이름\t나이\t주소");
		for(int i=0; i<index; i++) {
			Student s = students[i];
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getAddr()+"\t");
			System.out.println();
		}
	}
	public String getName(String str) {
		System.out.println("====== 학생 정보 "+str+" ======");
		System.out.println(str+"할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	
	public void noSearchStudent() {
		System.out.println("조회한 학생의 정보를 찾을 수 없습니다");
	}
	
	// 객체를 매개변수로 한 메서드
	public void printOneStudent(Student s) {
		System.out.println("이름 :\t"+s.getName());
		System.out.println("나이 :\t"+s.getAge());
		System.out.println("주소 :\t"+s.getAddr());
	}
	

	public Student updateStudent() { // Student 타입 객체 반환
		Student s = new Student();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("나이 입력 : ");
		s.setAge(sc.nextInt());
		System.out.print("주소 입력 : ");
		sc.nextLine();
		s.setAddr(sc.next());
		// Student s = new Student(name, age, addr);
		return s;
	}
	
	
}