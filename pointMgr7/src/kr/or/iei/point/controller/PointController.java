package kr.or.iei.point.controller;

import java.util.HashMap;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Grade;

public class PointController {
	
	private HashMap<String, Grade> members;
	private PointView view;
	public PointController() {
		super();
		members = new HashMap<String, Grade>();
		view = new PointView();
	}
	
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1 :
				insertMember();
				break;
			case 2 :
				printAllMember();
				break;
			case 3 :
				printOneMember();
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
				break;
				
			}
		}
	}


	public void deleteMember() {
		String name = view.getName("삭제");
		if(members.containsKey(name)) {
			members.remove(name);
		}else {
			view.noSearchMember();
		}
		
	}


	public void updateMember() {
		String name = view.getName("수정");
		if(members.containsKey(name)) {
			// 해당 이름이 있으면
			Grade g = view.updateMember(); // 새로 정보를 받아와서
			members.put(g.getName(), g); // 이름이 같으면 그냥 밀어넣고
			if(!(name.equals(g.getName()))) { // 이름이 같지 않으면 삭제한다
				members.remove(name);
			}
		}else {
			view.noSearchMember();
		}
	}


	public void printOneMember() {
		String name = view.getName("조회");
		if(members.containsKey(name)) {
			Grade g = members.get(name);
			view.printOneMember(g);
		}else {
			view.noSearchMember();
		}
	}


	public void printAllMember() {
		view.printAllMember(members);
	}


	public void insertMember() { // grade타입이 돌아옴
		Grade g = view.insertMember(); // 등급별 객체가 돌아옴
		members.put(g.getName(), g); //키값을 이름으로함
	}
}
