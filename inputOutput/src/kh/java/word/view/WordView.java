package kh.java.word.view;

import java.util.Scanner;

public class WordView {
	private Scanner sc;
	
	
	public WordView() {
		super();
		sc = new Scanner(System.in);
	}


	public int showMenu() {
		System.out.println("---- 끝말잇기게임 ----");
		System.out.println("1. 게임시작");
		System.out.println("2. 전적보기");
		System.out.println("0. 프로그램종료");
		System.out.print("선택 ? ");
		return sc.nextInt();
	}


	public void startGame() {
		System.out.println("---- 게임 시작 ----");
		
	}


	public void comTurn(String word) {
		System.out.println("컴퓨터 : "+word);
	}


	public String userTurn(char lastLetter) {
		System.out.println("["+lastLetter+"]로 시작하는 단어를 입력하세요");
		System.out.println("포기하는 경우 gg입력");
		System.out.print("단어 입력 : ");
		String word = sc.next();
		return word;
	}


	public void loseMsg() {
		System.out.println("당신이~ 졌습니다~");
	}


	public void noSearchMsg() {
		System.out.println("단어를 찾을 수 없습니다.");
		
	}


	public void wrongMsg() {
		System.out.println("잘못입력하셨습니다.");
	}


	public void winMsg() {
		System.out.println("당신이 이겼습니다 TT");
	}

}
