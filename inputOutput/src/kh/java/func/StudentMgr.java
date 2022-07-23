package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgr {
	private ArrayList<Student> students;
	private Scanner sc;
	public StudentMgr() {
		super();
		sc = new Scanner(System.in);
		students = new ArrayList<Student>();
		inputStudent();
	}
	
	public void main() {
		while(true) {
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 전체 조회");
			System.out.println("3. 학생 정보 내보내기");
			System.out.println("4. 학생 정보 불러오기");
			System.out.print("선택 >  ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1 :
				insertStudent();
				break;
			case 2 :
				printAllStudent();
				break;
			case 3 :
				outputStudent();
				break;
			case 4 :
				inputStudent();
				break;
			default :
				return;
			}
		}
	}
	
	
	private void inputStudent() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("students.txt");
			ois = new ObjectInputStream(fis);
			students = (ArrayList<Student>)ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public void outputStudent() {
		//Students를 직렬화해서 내보내기
		// 파일이름은 students.txt
		
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("students.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(students);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void insertStudent() {
		System.out.println("학생 정보 등록");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		String addr = sc.next();
		Student s = new Student(name, age, addr);
		students.add(s);
	}

	public void printAllStudent() {
		System.out.println("학생 정보 전체 출력 ");
		System.out.println("이름\t나이\t주소\t");
		for(Student s : students) {
			System.out.print(s.getName()+"\t");
			System.out.print(s.getAge()+"\t");
			System.out.print(s.getAddr()+"\t");
			System.out.println();
		}
	}
	
}
