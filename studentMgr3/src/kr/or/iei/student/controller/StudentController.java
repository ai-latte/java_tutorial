package kr.or.iei.student.controller;
import kr.or.iei.student.vo.Student;
import java.util.*;
import kr.or.iei.student.view.StudentView;

public class StudentController {
	private Student[] students;
	private int index;
	private Scanner sc;
	private StudentView view;
	
	public StudentController() {
		super();
		sc = new Scanner(System.in);
		students = new Student[10];
		view = new StudentView();
	}
	public StudentController(Student[] students, int index, Scanner sc, StudentView view) {
		super();
		this.students = students;
		this.index = index;
		this.sc = sc;
		this.view = view;
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
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
				return;
			default :
			}
		}
	}
	
	public void insertStudent() {
		// 사용자에게 이름, 나이, 주소를 입력받아 배열에 저장
		// 한번에 받기 위해 Student 객체로 받음
		// Student 객체 넣는 배열에 그대로 넣음
		Student s = view.insertStudent();
		students[index++] = s;
		view.Success("등록");
	}
	

	public void printAllStudent() {
		// 전체 학생 출력
		view.printAllSrudent(students, index);
	}
	
	public void printOneStudent() {
		// 이름입력 view
		// 이름이 존재하는지 조회 controller
		// 조회결과에 따른 출력 view
		
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		// 판단은 컨트롤러
		if(searchIndex==-1) {
			view.noSearchStudent();
		} else {
			// 배열과 인덱스 넘기기 X 객체를 넘기면 됨
			Student s = students[searchIndex];
			view.printOneStudent(s);
		}
		
	}
	
	public void updateStudent() {
		// 1. 수정할 학생의 이름을 받아온다 V
		// 2. 받아온 학생이 배열에 존재하는지 조회 C
		// 3. 조회 결과에 따른 처리
		// 3-1 조회 결과가 없는 경우 V
		// 3-2 조회 결과가 있는 경우 
		//3-2-1 수정할 학생 정보 입력 받기 V
		//3-2-2 수정할 학생 정보 배열에 반영 C
		int searchIndex = searchStudent(view.getName("수정"));
		if (searchIndex == -1) {
			view.noSearchStudent();
			} else {
				students[searchIndex] = view.updateStudent();
				//Student s = view.updateStudent();
				//students[searchIndex].setName(s.getName());
				//students[searchIndex].setAge(s.getAge());
				view.Success("수정");
			}
	}

	
	public void deleteStudent() {
		// 1. 삭제할 학생 이름을 받아온다 V
		// 2. 받아온 이름이 배열에 존재하는지 조회하고 C
		// - 조회할 수 없습니다 V
		// - 있으면 배열을 당겨 삭제 C
		int searchIndex = searchStudent(view.getName("삭제")); //getter아님
		if(searchIndex==-1) {
			view.noSearchStudent();
		} else {
			for(int i=searchIndex; i<index-1; i++) {
				students[i] = students[i+1];
			}
			view.Success("삭제");
			index--;
		}
		
	}
		
	
	public int searchStudent(String name) {
		for(int i=0; i<index; i++) {
			if(name.equals(students[i].getName())) {
				return i;
			}
		}
		return -1;
	}
	

	
} //클래스 끗