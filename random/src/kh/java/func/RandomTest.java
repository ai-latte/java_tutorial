package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void test1() {
		// 난수 : 임의의 값 / 무작위로 만들어지는 알 수 없는 값
		// 자바에서 난수를 제공하는 기능 : Random
		// Random 사용법
		// 1) java.util.Random
		// 2) Random r = new Random();
		Random r = new Random();
		int num = r.nextInt(); // int범위 내의 랜덤숫자 1개 가져옴
		System.out.println(num);

		int num1 = r.nextInt(16); // 0~15출력
		System.out.println(num1);

		int num2 = r.nextInt(21) + 10; // (0-20)+10 // 10-30
		System.out.println(num2);
		// r.nextInt(랜덤후보갯수)+시작숫자;

		int num3 = r.nextInt(16) + 20; // 20-35
		System.out.println(num3);
	}

	public void coin() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0; // 맞춘 횟수 //while문 안에 있으면, 돌 때마다 초기화 되므로
		int lose = 0; // 틀린 횟수 // 바깥에서 만들어줘야 함

		while (true) {
			System.out.println("=======동전 앞/뒤 맞추기=======");
			System.out.println("1. Game Start !");
			System.out.println("2. Game Score ");
			System.out.println("3. End Game TT");
			System.out.print("선택 >>>>>>  ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("<<게임진행>>");
				// 랜덤숫자로 1또는2
				// 1 = 앞면, 2 = 뒷면
				int coin = r.nextInt(2) + 1;

				// 유저에게 앞면/뒷면 선택(1/2)
				System.out.print("선택하세요 (1. 앞면 / 2. 뒷면) : ");
				int user = sc.nextInt();

				if (user == coin) {
					win++;
					System.out.println("정답입니다.");
				} else {
					lose++;
					System.out.println("틀렸습니다");
				}
				System.out.println("coit : " + coin);
			} else if (select == 2) {
				System.out.println("==========Game Score=========");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
			} else {
				System.out.println("안녕히 가세요~");
				break;
			}
		} // while end

	}// method end

	public void exam1() { // 가위바위보
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String crps = "";
		String urps = "";
		int win = 0;
		int lose = 0;
		int draw = 0;

		while (true) {
			System.out.println("=======가위 바위 보=======");
			System.out.println("1. Game Start !");
			System.out.println("2. Game Score ");
			System.out.println("3. End Game TT");
			System.out.print("선택 >>>>>>  ");
			int select = sc.nextInt();

			if (select == 1) {
				int com = r.nextInt(3) + 1;
				System.out.print("숫자를 선택하세요 (1.가위 2.바위 3.보) : ");
				int user = sc.nextInt();

				if (com == 1) {
					crps = "가위";
				} else if (com == 2) {
					crps = "바위";
				} else {
					crps = "보";
				}

				if (user == 1) {
					urps = "가위";
				} else if (user == 2) {
					urps = "바위";
				} else {
					urps = "보";
				}

				System.out.println("===========결과===========");
				System.out.println("컴퓨터는 " + crps + "를 냈습니다.");
				System.out.println("사용자는 " + urps + "를 냈습니다.");

				if (com == user) {
					System.out.println("무승부네요.");
					draw++;
				} else if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1)) {
					System.out.println(" 당신이 이겼습니다. . ..");
					win++;
				} else {
					System.out.println(" 내가 이겼어 !");
					lose++;
				}

			} else if (select == 2) {
				System.out.println(">>> Game Score <<<");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
				System.out.println("draw : " + draw);
			} else {
				System.out.println("안녕히 가세요~.~");
				break;
			}
		}
	} // method end

	public void exam2() {
		// up&dowm
		// com = 1~100의 난수를 가진다.
		// user > com {down}
		// user < com {up}

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int score = 0;

		while (true) {
			System.out.println("=======up&down=======");
			System.out.println("1. Game Start !");
			System.out.println("2. Game Score ");
			System.out.println("3. End Game TT");
			System.out.print("선택 >>>>>>  ");
			int select = sc.nextInt();

			if (select == 1) {
				int num = 0;
				int com = r.nextInt(99) + 1;
				System.out.print(" 내가 가진 숫자를 맞춰보세요~! (1~100) : ");
				while (true) {
					int user = sc.nextInt();
					if (com < user) {
						System.out.println("down~");
						System.out.print(num + 1 + "회차 번호 입력 : ");
					} else if (com > user) {
						System.out.println("up!");
						System.out.print(num + 1 + "회차 번호 입력 : ");
					} else {
						System.out.println("정답 !!!!");
						if (num < score || score == 0) {
							score = num;
						}
						break;
					}
					num++;
				}
			} else if (select == 2) {
				if (score == 0) {
					System.out.println("아직 게임 전입니다.");
				} else {
					System.out.println("당신의 최고 기록은 " + score + "입니다");
				}
			} else {
				System.out.println("안녕~");
				break;
			}
		}

	} // method

	public void exam3() {
		// BaskinRobbins
		// 1~31이 있슴
		// 컴퓨터선택 : for(횟수를 난수 1~3) { ((if 30이상이면 조절?)
		// 나도선택 : 1~3개의 숫자 순서대로

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win = 0;
		int lose = 0;

		while (true) {
			System.out.println("=======BaskinRobbins======");
			System.out.println("1. Game Start !");
			System.out.println("2. Game Score ");
			System.out.println("3. End Game TT");
			System.out.print("선택 >>>>>>  ");
			int select = sc.nextInt();
			int num = 0;

			if (select == 1) {
				System.out.println("<<< Game Start >>>");
				while (true) { // 1, 2, 3번 선택
					System.out.println("<<< Your Turn >>>");
					System.out.print("Input Number : ");
					int user = sc.nextInt();
					if (user < 0 || user > 3) { //while문도 가능 정상만 break;
						System.out.println("1~3사이 값을 다시 입력하세요.");
						continue;
					} else {
						for (int i = 0; i < user; i++) {
							num++;
							System.out.println(num+"!");
							if (num == 31) {
								System.out.println("패배TT");
								lose++;
								break;
							}
						}
					}

					if (num == 31) {
						break;
					} //게임 반복문 break;
					
					int com = r.nextInt(3) + 1;
					if(num>25) {
						com = r.nextInt(2) + 1;
					}
			 
					System.out.println("<<< Computer Turn >>>");
					for (int j = 0; j < com; j++) {
						num++;
						System.out.println(num + "!");
						
						if (num == 31) {
							System.out.println("승리!!!");
							win++;
							break; // for문을 나가는 break
						}
					} //com for end
					
					if (num == 31) {
						break;
					}
				}
			} else if (select == 2) {
				System.out.println("<< 당신의 전적 >>");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
			} else {
				System.out.println("안녕~");
				break;
			}

		}
	} // method
	
	
	
	// Dice게임
			// 기타 정보 : 소지금, win, lose, draw
			// 주사위 3개의 합을 겨룬다.
			// user = (1~6)난수 * 3 를 가진다.
			// com = (1~6)난수 * 3

			// 유저에게 난수를 보여주고 배팅하겠느냐고 묻는다. no=break yes=
			// 두 수를 비교하여 크면 win, 작으면 lose, 비기면 draw
			// 한 번 더 하시겠습니까? y : 소지금 있으면 go / no : 시작 메뉴로
	
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win = 0;
		int lose = 0;
		int draw = 0;
		int money = 10000;


		while (true) {
			System.out.println("=======Dice Game=======");
			System.out.println("1. Game Start !");
			System.out.println("2. Game Score ");
			System.out.println("3. End Game TT");
			System.out.print("선택 >>>>>>  ");
			int select = sc.nextInt();
			if (select == 1) {
				while (true) {
				int comd1 = r.nextInt(6) + 1;
				int comd2 = r.nextInt(6) + 1;
				int comd3 = r.nextInt(6) + 1;
				int csum = comd1 + comd2 + comd3;
				System.out.println("csum = " + csum); // 지우기

				int userd1 = r.nextInt(6) + 1;
				int userd2 = r.nextInt(6) + 1;
				int userd3 = r.nextInt(6) + 1;
				int usum = userd1 + userd2 + userd3;

				System.out.println("1번째 주사위 값 : " + userd1);
				System.out.println("2번째 주사위 값 : " + userd2);
				System.out.println("3번째 주사위 값 : " + userd3);

				System.out.println("내 주사위의 총 합 : " + usum);
				System.out.print("배팅 하시겠습니까? [y/n] : ");
				char select1 = sc.next().charAt(0);
				if (select1 == 'y' || select1 == 'Y') {
					System.out.print("얼마를 배팅하시겠습니까? (현재 내 소지금 : " + money + "원) : ");
					int bet = sc.nextInt();
					if (bet < 0 || bet > money) {
						System.out.println("다시 입력하세요.");
					}
					
					// 게임시작

					System.out.println("com 1번째 주사위 값 : " + comd1);
					System.out.println("com 2번째 주사위 값 : " + comd2);
					System.out.println("com 3번째 주사위 값 : " + comd3);
					System.out.println("com 주사위 총 합 : " + csum);
					if (usum > csum) {
						System.out.println("<<< 결과 >>>");
						System.out.println("승리~!\n+" + bet + "원");
						win++;
						money += bet;
					} else if (usum < csum) {
						System.out.println("<<< 결과 >>>");
						System.out.println("패배~!");
						lose++;
						money -= bet;		
					} else {
						System.out.println("<<< 결과 >>>");
						System.out.println("무승부~!");
						draw++;
					}
				} else if(select1 == 'n' || select1 == 'N')  {
					break;
				}
				
				System.out.print("한 번 더 하시겠습니까? [y/n] : ");
				char select2 = sc.next().charAt(0);
				if (select2 == 'y' || select2 == 'Y') {
					continue;
				} else {
					break;
				}
			} // while
				
			}else if (select==2) {
				System.out.println("<< 당신의 전적 >>");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
				System.out.println("draw : " + draw);
				System.out.println("내 소지금 : " + money);
			} else {
				break;
			}
			
			
			
		}//게임선택 while
	}// method
	
	
	/* 게임 선택 시, switch문 사용
	 boolean isEnd = false; // 전체 게임 종료를 위한 변수 < 추가
	 while(true) {
	 	System.out.println("=======Dice Game=======");
		System.out.println("1. Game Start !");
		System.out.println("2. Game Score ");
		System.out.println("3. End Game TT");
		System.out.print("선택 >>>>>>  ");
		int select = sc.nextInt();
		switch (select) {
	 * 	case 1:
	 * 		(게임 넣는 공간)
	 * 		break;
	 * 	case 2:
	 * 		System.out.println("<< 당신의 전적 >>");
			System.out.println("win : " + win);
			System.out.println("lose : " + lose);
			break; //end of switch
	 * 	case 3:
	 * 		isEnd = true;
	 * 		break; //end of switch
	 * 	}
	 * 	if(isEnd) {
	 * 		break;
	 * } //end of while
	 * 
	 * 
	 */

} // class end