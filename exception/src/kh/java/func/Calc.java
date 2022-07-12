package kh.java.func;

import kh.java.exception.UserException1;
import kh.java.exception.UserException2;

public class Calc {
	public void div(int num1, int num2) throws UserException2 {
		if(num2==0) { //분모가 0인 경우
			//throw new UserException1("0으로는 나눌 수 없습니다.");
			throw new UserException2("0으로는 나눌 수 없습니다.");
			// 에러가 나는 이유 : exception을 상속함
			// 
		}else {
			System.out.println((num1/num2));
		}
	}
}
