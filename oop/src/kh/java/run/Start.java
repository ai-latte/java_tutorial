package kh.java.run;
import kh.java.func.*;
public class Start {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv2 tv2 = new Tv2();
		System.out.println(tv1.power); //변수를 쓴 것
		System.out.println(tv2.isPower()); //메서드를 쓴 것
		tv1.power = true;
		tv2.setPower(true);
		tv1.ch=3;
		tv2.setCh(2);
		System.out.println(tv1.ch);
		System.out.println(tv2.getSize());
	}
}
