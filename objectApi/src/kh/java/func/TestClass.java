package kh.java.func;

public class TestClass implements Cloneable{

	
	@Override
	public String toString() {
		return "저는 TestClass입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
