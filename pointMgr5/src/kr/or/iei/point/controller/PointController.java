package kr.or.iei.point.controller;
import kr.or.iei.point.vo.*;
import kr.or.iei.point.view.PointView;
public class PointController {
	
	private Grade[] members;
	private int index;
	private PointView view;

	
	
	//기본 생성자
	public PointController() {
		super();
		members = new Grade[40];
		view = new PointView();
	}
	
	//모든 변수 직접초기화 생성자
	public PointController(Grade[] members, int index, PointView view) {
		super();
		this.members = members;
		this.index = index;
		this.view = view;
	}
	
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1 :
				insertMember();
				break;
			case 2 :
				showAllMember();
				break;
			case 3 :
				ShowOneMember();
				break;
			case 4 :
				updateMember();
				break;
			case 5 :
				deleteMember();
				break;
			case 0 :
				return;
			default :
				//inputAgain();
			}

		}//while
	}//mail
	
	
	
	// 1. view를 통해 받은 데이터를 저장하고,
	// 2. 컨트롤러에서 배열에 넣는 것만 해도 됨
	public void insertMember() {
		String grade = view.returnGrade("등록");
		switch(grade) {
		case "silver" :
			members[index] = new Silver(grade);
			//members[index].setGrade(grade);
			view.insertNamePoint(members[index]);
			index++;
			break;
		case "gold" :
			members[index] = new Gold(grade);
			view.insertNamePoint(members[index]);
			index++;
			break;
		case "vip" :
			members[index] = new Vip(grade);
			view.insertNamePoint(members[index]);
			index++;
			break;
		case "vvip" :
			members[index] = new Vvip(grade);
			view.insertNamePoint(members[index]);
			index++;
			break;
		}
		view.success("등록");
	}
	
	
	public void showAllMember() {
		// 인덱스와 객체를 넘겨주고 출력
		view.printAllmember(index, members);
	}
	
	
	public void ShowOneMember() {
		// 이름을 받아서 인덱스번호를 찾는다
		// 인덱스 번호를 넘겨주고 해당 멤버를 출력한다
		int searchIndex = searchMember(view.getName("조회"));
		if (searchIndex == -1) {
			view.noSearchMember();
		} else {
			view.printOneMember(members[searchIndex]);
		}
	}
	
	
	public void updateMember() {
		int searchIndex = searchMember(view.getName("수정"));
		if(searchIndex == -1) {
			view.noSearchMember();
		} else {
			String updateGrade = view.returnGrade("수정");
			switch(updateGrade) {
			case "silver" :
				members[searchIndex] = new Silver(updateGrade);
				view.insertNamePoint(members[searchIndex]);
				break;
			case "gold" :
				members[searchIndex] = new Gold(updateGrade);
				view.insertNamePoint(members[searchIndex]);
				break;
			case "vip" :
				members[searchIndex] = new Vip(updateGrade);
				view.insertNamePoint(members[searchIndex]);
				break;
			case "vvip" :
				members[searchIndex] = new Vvip(updateGrade);
				view.insertNamePoint(members[searchIndex]);
				break;
			}
			view.success("수정");
		}
	}
	
	
	public void deleteMember() {
		int searchIndex = searchMember(view.getName("삭제"));
		if (searchIndex == -1) {
			view.noSearchMember();
		} else {
			for (int i=searchIndex; i<index-1; i++) {
				members[i] = members[i+1];
			}
			index--;
			view.success("삭제");
		}
	}
	
	public int searchMember(String name) {
		for(int i=0; i<index; i++) {
			if(name.equals(members[i].getName())) {
				return i;
			}
		} return -1;
	}

}//클래스 종료