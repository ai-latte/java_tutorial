package kh.java.word.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import kh.java.word.view.WordView;

public class WordController {
	private ArrayList<String> words;
	private WordView view;
	private Random r;
	private int win;
	private int lose;
	

	public WordController() {
		super();
		words = new ArrayList<String>();
		view = new WordView();
		r = new Random();
		// 워드파일을 읽어온다
		// 한 줄에 하나씩 arraylist에 foreach로 add
		getWordFile();
	}
	
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1 :
				startGame();
				break;
			case 2 :
				break;
			case 0 :
				return;
			}
		}
	}
	
	public void startGame() {
		//1.words라는 리스트에서 랜덤으로 단어 1개 추출
		String word = words.get(r.nextInt(words.size()));
		view.startGame();
		view.comTurn(word);
		while(true) {
			char lastLetter = word.charAt(word.length()-1); //컴퓨터 입력의 마지막 값을 가져와서
			String userWord = view.userTurn(lastLetter); //유저에게 단어를 받아오고
			int userResult = checkWord(userWord, lastLetter); //결과를 체크하는 메서드로 보낸다
			if(userResult==-1) {
				return;
			} else if(userResult == 1) {
				continue; //반복문 상단으로 이동
			}
			char userLastLetter = userWord.charAt(userWord.length()-1);
			word = comTurn(userLastLetter); //랜덤으로 뽑았던 word에 넣어줌
			if(word == null) {
				win++;
				view.winMsg();
				return;
			}else {
				view.comTurn(word);
			}
		}
	}
	
	
	public String comTurn(char userLastLetter) {
		// 1. 문자열을 저장할 ArrayList
		// 2. words중에 사용자가 입력한 마지막글자로 시작하는 단어를 생성한 리스트에 add
		// 만약 마지막 글자로 시작하는 단어가 한개도 없으면 return null;
		// 단어 있으면 단어 중 랜덤단어 1개 리턴
		
		ArrayList<String> gameWords = new ArrayList<String>();
		for (String word : words) {
			if(word.charAt(0) == userLastLetter) {
				gameWords.add(word);
			}
		}
		if(gameWords.isEmpty()) { // 비어있으면 true; //if(list.size()==0;)
			return null;
		} else { // false
			return gameWords.get(r.nextInt(gameWords.size()));
		}
		
		
	}


	public int checkWord(String userWord, char lastLetter) {
		// 1. 사용자가 "gg"입력한 경우 = return -1
		// 2. 사용자가 정상입력한 경우 = 이전단어 끝글자와 첫글자가 일치
		// 						= 입력한 단어가 words에 존재하는지
		// = 두 조건을 모두 만족하면 return 0
		// 3. 비정상인 경우
		// 3-1. 이전단어 끝글자와 첫글자가 다른 경우
		// 3-2. 이전단어 끝글자와 입력단어 첫글자는 같은데 words에 존재하지 않는 경우
		// = return 1
		
		char userFirst = userWord.charAt(0);
		if(userWord.equals("gg")) {
			view.loseMsg();
			lose++;
			return -1;
		}
		if(userFirst==lastLetter) { // (words.indexOf(userWord) != -1)
			if (words.contains(userWord)) {
				return 0; // 다음턴 진행
			} else {
				view.noSearchMsg();
				return 1;
			}
		} else {
			view.wrongMsg();
			return 1;
		}
	}


	public void getWordFile() {
		BufferedReader br = null;
		//try밖에서도 사용할 것이기 때문에 밖에서 선언
		//close해줘야 하기 때문
		try {
			FileReader fr = new FileReader("words.txt");
			br = new BufferedReader(fr);
			while(true) {
				String word = br.readLine();
				if(word == null) {
					break;
				}
				words.add(word);
			}
		}  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}