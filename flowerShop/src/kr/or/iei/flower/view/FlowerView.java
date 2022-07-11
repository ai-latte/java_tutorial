package kr.or.iei.flower.view;
import kr.or.iei.flower.vo.*;
import java.util.Scanner;
public class FlowerView {
	
		Scanner sc = new Scanner(System.in);
		
		// 전체 메뉴
		public int mainMenu() {
			System.out.println("1. 직 원 ");
			System.out.println("2. 고 객 ");
			System.out.println("3. 나가기 ");
			System.out.print("선택 > > > ");
			return sc.nextInt();
		}
	
		// 혜진님 - 메뉴
		public int showMenu1() {
			System.out.println("1. 상품 확인");
			System.out.println("2. 상품 등록");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("0. 나가기");
			System.out.print("선택 >>> ");
			return sc.nextInt();
		}
		
		// 혜진님 - 재고 보기
		public void printAllFlower(Bouquet[] b, int index) { // 배열과 인덱스
			System.out.println("이름\t사이즈\t수량\t가격\t판매가");
			for(int i=0; i<index; i++) {
				System.out.print(b[i].getName()+"\t");
				System.out.print(b[i].getSize()+"\t");
				System.out.print(b[i].getAmount()+"\t");
				System.out.print(b[i].getPrice()+"\t");
				System.out.print(b[i].getSellPrice()+"\t");
				System.out.println();
			}
		}
		
		// 혜진님 - 상품등록
		public Bouquet insert() {
			System.out.print("상품 이름 등록 : ");
			String name = sc.next();
			System.out.print("사이즈 등록 [S/M/L] : ");
			sc.nextLine();
			String size = sc.next();
			System.out.print("제작한 수량 등록 : ");
			int amount = sc.nextInt();
			System.out.print("제작 비용 등록 : ");
			int price = sc.nextInt();
			Bouquet b = null;
			switch(size) {
			case "S" :
				Small s = new Small(name, size, price, amount);
				b = (Bouquet)s;
				break;
			case "M" :
				Medium m = new Medium(name, size, price, amount);
				b = (Bouquet)m;
				break;
			case "L" :
				Large l = new Large(name, size, price, amount);
				b = l;
				break;
			default :
				break;
			}
			return b;
		}
		
		public Bouquet updateFlower() {
			sc.nextLine();
			System.out.print("수정 사이즈 입력 [S/M/L] : ");
			String size = sc.next();
			System.out.print("수정 이름 입력 : ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("수정 수량 입력 : ");
			int amount = sc.nextInt();
			System.out.print("수정 가격 입력 : ");
			int price = sc.nextInt();
			Bouquet bou =null;
			switch(size) {
			case "S" :
				bou = new Small(size,name,price,amount);
				break;
			case "M" :
				bou = new Medium(size,name,price,amount);
				break;
			case "L" :
				bou = new Large(size,name,price,amount);
				break;	
			default :
				break;
			}
			return bou;
		} 
		
		
		public String getName(String str) {
			System.out.println("====== 회원정보" + str + "=======");
			System.out.print(str +" 할 이름 입력 : ");
			String name = sc.next();
			System.out.println();
			return name;
		}

	
		// 은비 - 다발 예약 메뉴
		public int showMenu() {
			System.out.println("✿ * 꽃다발 예약 ✿ *");
			System.out.println("1. 예약 하기");
			System.out.println("2. 예약 확인");
			System.out.println("3. 예약 취소");
			System.out.println("0. 나가기");
			System.out.print("선택 > > >  ");
			return sc.nextInt(); 
		}
		
		// 판매 가능 다발 보기
		public char showBouquet(Bouquet[] flowers, int index) { // 배열과 인덱스
			System.out.println("현재 예약 가능한 꽃다발입니다");
			System.out.println("상품넘버\t꽃스타일\t사이즈\t수량\t판매가격");
			for(int i=0; i<index; i++) {
				System.out.print((i+1)+"\t");
				System.out.print(flowers[i].getName()+"\t");
				System.out.print(flowers[i].getSize()+"\t");
				System.out.print(flowers[i].getAmount()+"\t");
				System.out.print(flowers[i].getSellPrice());
				System.out.println();
			}
			System.out.print("예약을 진행하시겠습니까 ? [y/n]");
			return sc.next().charAt(0);
		}
		
		
		public int reserveBouquet(String s) {
			System.out.print("예약할 꽃다발의 "+s+"를 입력해 주세요 : ");
			return sc.nextInt();
		}
	
		public void success(int num) {
			System.out.println("예약 완료!");
			System.out.println(" *✿ 당신의 예약 번호는 "+num+"번 입니다 *✿");
			System.out.println("꼭 기억해 주세요 !");
		}
		
		public void checkReserve(Reservation[] rsv, int i) {
			System.out.printf(" *✿고객님은 %s 꽃다발 %d개를 예약하셨습니다\n *✿", rsv[i].getRsvProduct(), rsv[i].getRsvAmount());
		}
		
		public int checkNum() {
			System.out.println("예약번호를 입력하세요");
			System.out.print("입력 > > > ");
			return sc.nextInt();
		}
		
		public char deleteReservation() {
			System.out.print("정말 예약을 취소하시겠습니까? [y/n] : ");
			return sc.next().charAt(0);
		}
		
		public void misType() {
			System.out.println("잘못 입력하셨습니다.");
		}
 
		public void cancle() {
			System.out.println("예약이 취소되었습니다");
		}
}
