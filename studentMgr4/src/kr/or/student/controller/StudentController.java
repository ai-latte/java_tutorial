package kr.or.student.controller;

import java.util.ArrayList;

import kr.or.student.view.StudentView;
import kr.or.student.vo.Student;

public class StudentController {
	//private Student[] students1;
	//private int index;
	
	private ArrayList<Student> students; // 인덱스 필요없음
	private StudentView view;
	
	public StudentController() {
		super();
		//students1 = new Student[10];
		students = new ArrayList<Student>();
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
			default :
				break;
			}
		}
	}

	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.noSearchStudent();
		} else {
			students.remove(searchIndex);
		}
		
	}

	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchStudent(name);
		if(searchIndex==-1) {
			view.noSearchStudent();
		} else {
			Student s = view.updateStudent();
			// 1) setter 이용 방법
//			Student stu = students1[searchIndex]; 배열임
			Student stu = students.get(searchIndex);
			stu.setName(s.getName());
			stu.setAge(s.getAge());
			stu.setAddr(s.getAddr());
			
			// 2) 받아온 객체를 교체하는 방법
			students.set(searchIndex, s);

		}
	}

	private void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if(searchIndex==-1) {
			view.noSearchStudent();
		} else {
			view.printOneStudent(students.get(searchIndex));
		}
		
	}
	
	public int searchStudent(String name) {
//		for(int i=0; i<index; i++) {
//			if(name.equals(students1[i].getName())) {
//				return i;
//			}
//		}
		for(int i=0; i<students.size(); i++) {
			Student s = students.get(i);
			if(name.equals(s.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printAllStudent() {
		// view.printAllStudent(student1, index); 배열과 인덱스 보냄
		view.printAllStudent(students);
	}
	
	public void insertStudent() {
		Student s = view.insertStudent();
//		students1[index++] = s;   배열일 때
		students.add(s);
		view.success("등록");
	}
	
	
	
	
}//클래스종료