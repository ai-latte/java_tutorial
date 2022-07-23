package kh.java.func;

public class Dog extends Animal {
	public void barking() {
		System.out.println("멍멍");
	}
	
	@Override
	public void breath() {
		System.out.println("낑낑");
	}
}
