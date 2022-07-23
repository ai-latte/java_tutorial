package kh.java.function;

public class MethodTest {
	private int a;
	private int b;
	private int c;
	
	public MethodTest() {
		super();
	}


	public MethodTest(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}
	
	public int add(int a, int b) {
		return a+b;
	}


}
