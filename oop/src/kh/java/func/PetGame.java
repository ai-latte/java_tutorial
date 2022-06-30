package kh.java.func;
import java.util.Scanner;
import java.util.Random;
public class PetGame {
	String name;
	int full; //10
	int clean; //10
	int close; //50
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	public void Start() {
		System.out.print("이름을 정해 주세요. : ");
		name = sc.nextLine();
		full = 5;
		clean  = 5;
		close = 5;
		
		System.out.println("        ▒▒");
		System.out.println("      ▒▒▒▒▒▒");
		System.out.println("    ▒▒▒▒▒▒▒▒▒▒");
		System.out.println("  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		while(true) {
		if(full>=10) {
			full=10;
		} else if(full<0) {
			full = 0;
		}
		if(clean>=10) {
			clean=10;
		} else if(clean<0) {
			clean=0;
		}
		if(close>=50) {
			close=50;
		} else if(close<0) {
			close=50;
		}
		System.out.println("  │"+name+"'s house│");
		System.out.println("───────────▼・ᴥ ・▼─────");
		System.out.println(" ▒▒▒▒ 1.살피기  ▒▒▒▒▒");
		System.out.println(" ▒▒▒▒▒ 2.밥주기  ▒▒▒▒");
		System.out.println(" ▒▒▒▒ 3.공놀이  ▒▒▒▒▒");
		System.out.println(" ▒▒▒▒▒ 4.씻기기  ▒▒▒▒");
		System.out.println(" ▒▒▒▒ 5.산책♣  ▒▒▒▒▒");
		System.out.println(" ▒▒▒▒▒ 6. 나가기 ▒▒▒▒");
		System.out.println(" ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.print(name+"하고 뭐할래? >>>>>  ");
		int sel = sc.nextInt();
		switch(sel) {
		case 1 :
			showCondition();
			break;
		case 2 :
			food();
			break;
		case 3 :
			if(full==0) {
				System.out.println(" - 배고파서 못해요 - ");
				System.out.println(" - 밥 먼저 주세요 - ");
				return;
			} else {
				ballGame();
			}
			break;
		case 4 :
			if(close==0) {
				System.out.println(" - 어색해요 ! 좀 더 친해지세요 - ");
				return;
			} else {
				wash();
			}
			break;
		case 5 :
			walk();
			break;
		case 6 :
			System.out.println(" ▼・ᴥ ・▼ bye~ ");
			return;
		}//switch	
		}//while
		
	}


	
	public void ballGame() {
		System.out.println("───────────▼・ᴥ ・▼─────");
		System.out.print("1, 2, 3 중 선택하세요 >>> ");
		int num = sc.nextInt();
		int com = r.nextInt(3)+1;
		System.out.println("		o	");
		delay(500);
		System.out.println("	o		");
		delay(500);
		System.out.println("		o	");
		delay(500);
		System.out.println("o			");		
		delay(500);
		if (com==1) {
		System.out.println("  	o			");
		System.out.println("│o │			");
		System.out.println("└──┘			");
		System.out.println(" - 1번 컵에 골인 ! - ");
			} else if(com==2) {
				System.out.println("  	o		");
				System.out.println("	│o │	");
				System.out.println("	└──┘	");
				System.out.println(" - 2번 컵에 골인 ! - ");
			} else if(com==3) {
				System.out.println("  		   o");
				System.out.println("		│o │");
				System.out.println("	  	└──┘");
				System.out.println(" - 3번 컵에 골인 ! - ");
			}
		if(com==num) {
			System.out.println(" - 강아지와 통했어요 ! - ");
			System.out.println(" - 친밀도가 5 올랐어요 ! - ");
			close+=5;

		} else {
			System.out.println(" - 강아지와 통하지 않았지만 즐거웠어요 - ");
			System.out.println(" - 친밀도가 1 올랐어요 ! - ");
			close++;

		}
		System.out.println();
		System.out.println("──────────────────────");
	}
	
	
	public void delay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void showCondition() {
		System.out.println("───────────▼・ᴥ ・▼─────");
		System.out.println();
		System.out.println(" ["+name+"의 현재 상태] ");
		if(close==50) {
			System.out.println("친밀도\t: "+close+" / 50");
			System.out.println(" - 당신을 최고로 좋아해요 ! - ");
		} else {
			System.out.println("친밀도\t: "+close+" / 50");
		}
		System.out.println("청결도\t: "+clean+" / 10");
		System.out.println("배부름\t: "+full+" / 10");
		System.out.println();
		System.out.println("──────────────────────");
	}
	
	
	public void wash() {
		if(close<10) {
			System.out.println(" - 씻기기 전에 먼저 친해지세요 - ");
			return;
		} else {
			System.out.println();
			System.out.println();
			for(int i=0; i<8; i++) {
				System.out.print("☹☻☹");
				delay(1000);
			}
			System.out.println();
			System.out.println(" - 깨끗해진 "+name+" ! - ");
			System.out.println(" - 하지만 당신이 조금 싫어졌어요 - ");
			System.out.println(" - 친밀도가 1 낮아졌어요 - ");
			System.out.println(" - 배부름이 1 낮아졌어요 - ");
			System.out.println();
			clean = 10;
			full--;
			close--;
		}
	}
	
	public void food() {
		System.out.println("───────────▼・ᴥ ・▼─────");
		System.out.println("1.사료 2. 삶은 단호박 3. 닭고기");
		System.out.print(name+"에게 무엇을 줄까요? ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("- 잘 먹었어요 -");
			System.out.println(" - 배부름이 5 증가했어요 - ");
			full+=5;
			break;
		case 2 :
			System.out.println(" - 맛있게 먹었지만 단호박이 "+name+"의 털에 묻었어요 - ");
			System.out.println(" - 청결도가 1 낮아졌어요 - ");
			System.out.println(" - 배부름이 3 증가했어요 - ");
			full+=3;
			clean--;
			break;
		case 3 :
			System.out.println(name+"이/가 가장 좋아하는 음식이네요 ! - ");
			System.out.println(" - 배가 가득 찼어요 ! - ");
			full=10;
			break;
		}
	}
	
	
	
	public void walk() {
		System.out.println("───────────▼・ᴥ ・▼─────");
		System.out.println("오늘은 어디로 산책을 갈까요 ?  ");
		System.out.println("1. 공원 ");
		System.out.println("2. 하천 ");
		System.out.println("3. 안 할래 ");
		System.out.print("선택 >>>>  ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println(" - 공원 산책 - ");
			System.out.println();
			for(int i=0; i<6; i++) {
				System.out.print("─♣─");
				delay(500);
			}
			System.out.println();
			System.out.println("- 즐거운 산책이었어요 -");
			System.out.println("- 친밀도가 3 올라갔어요 -");
			System.out.println("- 배부름이 1 내려갔어요 -");
			System.out.println("- 청결도가 1 내려갔어요 -");
			close+=3;
			full--;
			clean--;
			break;
		case 2 :
			System.out.println(" - 하천 산책 - ");
			System.out.println();
			for(int i=0; i<6; i++) {
				System.out.print("~~");
				delay(500);
			}
			System.out.println();
			System.out.println("- 즐거운 산책이었어요 -");
			System.out.println("- 친밀도가 5 올라갔어요 -");
			System.out.println("- 배부름이 2 내려갔어요 -");
			System.out.println("- 청결도가 2 내려갔어요 -");
			close+=5;
			full-=2;
			clean-=2;
			break;
		case 3 :
			System.out.println(" - 변덕스럽네요 - ");
			System.out.println(" - "+name+"이/가 실망했어요  - ");
			System.out.println(" - 친밀도가 3 낮아졌어요 - ");
			close-=3;
			break;
		}
	}
	
	
}