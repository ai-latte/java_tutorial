package kr.or.student.controller;

import java.util.HashMap;

import kr.or.student.view.StudentView;
import kr.or.student.vo.Student;

public class StudentController {
	
	private HashMap<String, Student> students;
	// key값으로 이름, value를 학생 객체 사용
	private StudentView view;
	public StudentController() {
		super();
		students = new HashMap<String, Student>();
		view = new StudentView();
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
			}
		}
	}

	public void updateStudent() {
		String name = view.getName("수정");
		if(students.containsKey(name)) {
			Student s = view.updateStudent();
			students.put(s.getName(), s);
			if(!name.equals(s.getName())) {
				students.remove(name);
			}
		}else {
			view.noSearchStudent();
		}
	}

	public void deleteStudent() {
		String name = view.getName("삭제");
		if(students.containsKey(name)) {
			students.remove(name);
		}else {
			view.noSearchStudent();
		}
	}

	public void printOneStudent() {
		String name = view.getName("조회"); // 키
		if(students.containsKey(name)) { //true
			Student s = students.get(name);
			view.printOneStudent(s);
		} else{ //false
			view.noSearchStudent();
		}
	}

	public void printAllStudent() {
		view.printAllStudent(students);
		
	}

	public void insertStudent() {
		Student s = view.insertStudent();
		// 입력받은 값 중 이름을 key
		// Student 객체를 value로 설정하여 map에 저장
		students.put(s.getName(), s);
	}

	
}
