package kh.java.exception;

public class UserException1 extends RuntimeException {
	// 반드시 체크하지 않아도 되는 것 unchecked exception
	// 런타임 에러는 강요되지 않음
	
	public UserException1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException1(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	
}
