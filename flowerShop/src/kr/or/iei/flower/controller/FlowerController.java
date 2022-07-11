package kr.or.iei.flower.controller;
import kr.or.iei.flower.vo.*;
import kr.or.iei.flower.view.FlowerView;
import kr.or.iei.flower.view.*;
public class FlowerController {
	
	private Bouquet[] flowers;
	private int index;
	private FlowerView view;
	/////////////////////// 
	private Reservation[] rsv;
	private int rsvIndex;
	private int tmp;
	////////////////////// < 추가한 예약용 변수
	
	public FlowerController() {
		super();
		flowers = new Bouquet[40];
		rsv = new Reservation[10];
		view = new FlowerView();
		tmp = 1;
	}
	
	
	// 직원 + 고객 합친 메인메서드
	public void main() {
		while(true) {
			int sel = view.mainMenu();
			switch(sel) {
				case 1 :
					stock();
					break;
				case 2 :
					guest();
					break;
				default :
					return;
			}
		}
	}
	
	public void stock() {
		while (true) {
			int sel = view.showMenu1();
			switch (sel) {
			case 1:
				printAllFlower();
				break;
			case 2:
				insertStock();
				break;
			case 3:
				updateFlower();
				break;
			case 4:
				deleteFlower();
				break;
			case 0:
				return;

			}
		}
	}

	public void insertStock() {
		flowers[index++] = view.insert();
	}
	
	public void printAllFlower() {
		view.printAllFlower(flowers, index);

	}
	
	public void updateFlower() {
		String name = view.getName("수정");
		int searchIndex = searchName(name);
		if (searchIndex == -1) {
			view.misType();
		} else {
			Bouquet bou = view.updateFlower();
			flowers[searchIndex] = bou;
		}
	}

	public void deleteFlower() {
		String name = view.getName("삭제");
		int searchIndex = searchName(name);
		if (searchIndex==-1) {
			view.misType();
			
		}else {
			for (int i=searchIndex;i<index-1;i++) {
				flowers[i]=flowers[i+1];
			}
		}
		index--;
	}

	public int searchName(String name) {
		for (int i = 0; i < index; i++) {
			Bouquet bou = flowers[i]; // flower의 i번째 값을 Bouquet 배열에 순차적으로 넣어줌
			if (name.equals(bou.getName())) {
				return i;
			}
		}
		return -1;
	}

	
	// 은비 - 손님 예약 메서드
	public void guest() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1 :
				reserveBouquet();
				break;
			case 2 :
				checkReservation();
				break;
			case 3 : // 예약취소
				deleteReservation();
				break;
			case 0 : // 나가기
				return;
			}
		}
	}

	// 혜진님 - 재고추가
	
	

	// 다발 예약
	public void reserveBouquet() {
		char answer = view.showBouquet(flowers, index);
		if(answer == 'y') {
			int num = (view.reserveBouquet("상품넘버"))-1; // 인덱스+1
			int selAmount = view.reserveBouquet("구매수량");
			if(selAmount<0 || selAmount>flowers[num].getAmount()) {
				view.misType();
			} else {
			flowers[num].setAmount((flowers[num].getAmount())-selAmount); // flower의 수량을 깎는다
			Reservation r = new Reservation(tmp, selAmount, flowers[num].getName()); // 예약자용 객체 생성
			rsv[rsvIndex] = r;  // 예약자용 배열에 넣는다
			view.success(tmp); 	// 예약번호를 고객에게 알린다
			tmp++;
			rsvIndex++;
			}
		} else {
			return;
		}
	}
	

	// 예약 확인
	public void checkReservation() {
		int guestNum = view.checkNum(); // 고객이 입력한 예약번호를 변수에 담는다
		for(int i=0; i<rsvIndex; i++) {
			if(guestNum == rsv[i].getRsvNum()) {
				view.checkReserve(rsv, i);
			} else { 
				view.misType();
				return;
			}
		}
		
	
	}
	
	// 예약번호를 입력한다
	// 예약번호를 가진 인덱스를 찾는다
	// 해당 인덱스부터 하나씩 당겨와서 지운다
	public void deleteReservation() {
		int searchIndex = searchNum(view.checkNum());
		if(searchIndex == -1) {
			view.misType();
			return;
		} else {		
			char answer = view.deleteReservation(); // 정말 취소하시겠습니까?
			if(answer == 'n') {
				return;
			} else {	// y 선택 > 예약 취소 > 재고에서 차감했던 수량을 다시 넣어준다
				for(int i=0; i<index; i++) {
					if(rsv[searchIndex].getRsvProduct().equals(flowers[i].getName())) {
						flowers[i].setAmount((flowers[i].getAmount())+rsv[searchIndex].getRsvAmount());
					}
				}
				// 예약자 명단에서 지워준다
				for(int i=searchIndex; i<rsvIndex-1; i++) {
					rsv[i] = rsv[i+1];
				}
				view.cancle();
				rsvIndex--;
			}	
		}
	}
	
	
	
	public int searchNum(int reserveNum) {
		for(int i=0; i<rsvIndex; i++) {
			if(reserveNum==(rsv[i].getRsvNum())) {
				return i;
			}
		} return -1;
	}
	
	
}
