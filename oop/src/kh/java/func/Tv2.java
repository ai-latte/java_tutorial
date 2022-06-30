package kh.java.func;

public class Tv2 {
	// Tv2클래스의 전역변수에 외부직접접근을 막기위해
	// private 접근제어지시자 사용 > 정보은닉
	private int size;
	private boolean power;
	private int ch;
	private int vol;
	// 정보은닉을 하게되면 외부에서 변수를 사용할 수 없음
	// 변수의 데이터를 대입하고, 값을 가져올 수 있는 메소드를 생성
	// > getter, setter
	
	
	// 생성자
	// 전역변수와 getter, setter 사이에 만든다
	public Tv2() {
		// 리턴에 대한 개념이 없기 때문에 반환타입 자체를 적지 않음
		// 객체가 정상적으로 돌아가기 위해 필요한 값을 초기화
		this.size = 100;
	}
	
	// 생성자 오버로딩
	public Tv2(int size) {
		this.size = size;
	}
	
	
	//----------------------------
	// getter변수의 데이터를 보여주는 목적
	// get+변수명 < 카멜표기법
	// 반환타입은 해당 변수의 타입 그대로
	public int getSize() {
		return size;
	}
	
	public int getVol() {
		return vol;
	}
	
	public int getCh() {
		return ch;
	}
	
	public boolean isPower() {
		return power;
	}
	
	//----------------------------
	// setter는 메서드를 통해 전역변수에 값을 대입
	// set+변수명 < 카멜표기법
	// 값을 넣어주기만 하기 때문에 반환타입은 없음 = void
	// 단, get과 달리 같은 타입의 매개변수 존재
	public void setSize(int size) {
		this.size = size;
		// size만 쓰면 지역변수가 되어버림
		// this. 을 붙여 전역변수로 지정
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
}
