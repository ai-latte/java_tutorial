package kh.java.test;
import kh.java.func.PrintMsg; //위치를 알려주는 import문
public class HelloJava {
	
	public static void main(String[] args) {
		/*
		 클래스이름 약어 = new 클래스이름();
		 약어.메서드이름();
		 */
		PrintMsg pm = new PrintMsg();
		pm.printMsg();
	}
}
