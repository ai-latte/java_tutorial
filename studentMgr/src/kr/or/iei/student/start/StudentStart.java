package kr.or.iei.student.start;
import kr.or.iei.student.controller.StudentController;
public class StudentStart {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		// 생성자 만들었기 때문에 생성과 동시에 초기화 됨
		sc.main();
	}

}
