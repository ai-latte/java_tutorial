package kh.java.func;
import java.util.Scanner;
public class Cafe {
	int kind; //1.아메 2.라떼 3.모카 4.아이스티 5.카모마일 
	boolean temp;	//true : ice, false : hot
	boolean size;	//true : tall, false : grande
	int shot;		// 샷
	boolean money;	//true : card, false : 현금
	boolean inOut;	//true : in, false : out
	int amount;		// 수량
	Scanner sc = new Scanner(System.in); // 전역변수
	
	
	// 카페 운영 메서드
	public void start() {
		while(true) {
			System.out.println("----------------");
			System.out.println("1. menu");
			System.out.println("2. order");
			System.out.println("3. order check");
			System.out.println("4. end");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				showMenu();
				break;
			case 2 :
				order();
				break;
			case 3 :
				showLastOrder();
				break;
			case 4 :
				// break; 스위치 종료문 대신 메서드 종료
				System.out.println("bye~");
				return;
			}
		}
	}
	
	public void showLastOrder() {
		// 전역변수에 남은 마지막 주문 보여주기
		System.out.println("----------------");
		System.out.print("주문한 음료는, ");
		if (kind==1) {
			System.out.println("아메리카노");
		} else if(kind==2) {
			System.out.println("카페라떼");
		} else if(kind==3) {
			System.out.println("카페모카");
		} else if(kind==4) {
			System.out.println("아이스티");
		} else if(kind==5){
			System.out.println("카모마일");
		}
		
		if(temp) {
			System.out.println("ICE");
		} else {
			System.out.println("HOT");
		}
		
		if(size) {
			System.out.println("tall");
		} else {
			System.out.println("grande");
		}
		
		if(kind!=5) {
			System.out.println("샷 추가는 "+shot+"번");
		}
		
		if(money) {
			System.out.println("결제수단 : 카드");
		} else {
			System.out.println("현금");
		}
		
		if(inOut) {
			System.out.println("드시고 가시고");
		} else {
			System.out.println("가져가시고");
		}
		
		System.out.println("수량은 "+amount+"개");
	}
	
	// 주문 메서드
	public void order() {
		showMenu();
		System.out.println("----------------");
		System.out.print("음료를 선택하세요 : ");
		kind = sc.nextInt();
		System.out.print("온도 선택 [1.ice / 2.hot] : ");
		int tempSel = sc.nextInt();
		if (tempSel==1) {
			temp = true;
		} else {
			temp = false;
		}
		System.out.print("사이즈를 선택하세요 [1.tall / 2. grande] : ");
		int sizeSel = sc.nextInt();
		if(sizeSel==1) {
			size = true;
		} else {
			size = false;
		}
		if(kind != 5) {
			System.out.print("샷은 몇 번 추가하시겠습니까? ");
			shot = sc.nextInt();
		}
		System.out.print("결제수단 [1. 카드 2. 현금] : ");
		int moneySel = sc.nextInt();
		if(moneySel==1) {
			money = true;
		} else {
			money = false;
		}
		System.out.print("1. 매장 / 2. 테이크아웃  : ");
		int inOutSel = sc.nextInt();
		if(inOutSel==1) {
			inOut = true;
		} else {
			inOut = false;
		}
		System.out.print("몇 잔 드릴까요? : ");
		amount = sc.nextInt();
		System.out.println("주문이 완료되었습니다.");
		brewing();
	}
		
	
	public void brewing() { // 졸귀탱
		System.out.println("       o ");
		delay(1000);
		System.out.println("       o ");
		delay(1000);
		System.out.println("       o ");
		delay(1000);
		System.out.println("       o ");
		delay(1000);
		System.out.println("       o ");
		delay(1000);
		System.out.println("│~~~~~~~~~~├─┐");
		System.out.println("│          │ │");
		System.out.println("│          │ │");
		System.out.println("│          ├─┘");
		System.out.println("│          │  ");
		System.out.println("└──────────┘  ");
		System.out.println("음료가 나왔습니다");
	}
	
	public void delay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	// 메뉴판 출력 메서드
	public void showMenu() {
		System.out.println("----------------");
		System.out.println("1. americano");
		System.out.println("2. cafeLatte");
		System.out.println("3. cafeMocha");
		System.out.println("4. iceTea");
		System.out.println("5. chamomile");
	}
	

	
}// 클래스 종료
