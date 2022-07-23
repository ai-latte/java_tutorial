package kr.or.iei.student.controller;

import java.util.ArrayList;
import kr.or.iei.student.view.StudentView;
import kr.or.iei.student.vo.Student;

public class StudentController {

	ArrayList<Student> students;
	StudentView view;
	public StudentController() {
		super();
		students = new ArrayList<Student>();
		view = new StudentView();
	}
	
	
	public void main() {
		while(true) {
			int sel = view.getSel();
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
				return;
			}
		}
		
	}
	
	private void deleteStudent() {
		String name = view.checkStudent("삭제");
		Student s = checkStudent(name);
		students.remove(s);
	}


	private void updateStudent() {
		String name = view.checkStudent("수정");
		Student s = checkStudent(name);
		view.updateStudent(s);
	}


	private void printOneStudent() {
		String name = view.checkStudent("조회");
		Student s = checkStudent(name);
		view.printOneStudent(s);
	}
	
	
	// 이름을 받아서 있는지 없는지 확인하는 체크 메서드
	private Student checkStudent(String name) {
		for(Student s : students) {
			if(name.equals(s.getName())) {
				return s;
			}
		}
		view.noSearchStudent();
		return null;
	}


	private void printAllStudent() {
		// 전체학생출력
		view.printAllStudent(students);
	}


	public void insertStudent() {
		// 학생 정보 객체에 담아서 저장하기
		Student s = view.insertStudent();
		students.add(s);
	}
	
	
}
