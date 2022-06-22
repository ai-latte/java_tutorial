package kh.java.run;
import kh.java.func.*;
public class Start {

	public static void main(String[] args) {
		Variable vr = new Variable();
		vr.var1();
		vr.var2();
		vr.var3();
		vr.var4();
		vr.print();
		

		int num = 100;
		long lo = 999900000000l; //int로 처리할 수 없음
		float f = 486.520f;
		double dNum = 5697.890123;
		char ch = 'A';
		String str = "Hello JAVA";
		boolean bool = true;
		
		System.out.println(num);
		System.out.println(lo);
		System.out.println(f);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
		System.out.println();
		
		info inf = new info();
		inf.inf();
		System.out.println();System.out.println();System.out.println();
		
		
		Scan sc = new Scan();
		sc.scan1();
		sc.scanExam1();
		sc.scanExam2();

		}
}