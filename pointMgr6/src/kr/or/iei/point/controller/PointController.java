package kr.or.iei.point.controller;

import java.util.ArrayList;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.*;

public class PointController {
	
	private ArrayList<Grade> members;
	private PointView view;
	public PointController() {
		super();
		members = new ArrayList<Grade>();
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
				printAllMembers();
				break;
			case 3 :
				printOneMembers();
				break;
			case 4 :
				updateMember();
				break;
			case 5 :
				deleteMember();
				break;
			case 0 :
				return;
			}
		}
	}

	public void deleteMember() {
		String name = view.getName("삭제");
		int searchindex = searchMember(name);
		if(searchindex == -1) {
			view.noSearch();
		} else {
			members.remove(searchindex);
		}
	}

	public void updateMember() {
		String name = view.getName("수정");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.noSearch();
		} else {
			members.set(searchIndex, view.updateMember());
		}
	}

	public void printOneMembers() {
		String name = view.getName("조회");
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			view.noSearch();
		} else {
			view.printOneMember(members.get(searchIndex));
		}
	}

	public int searchMember(String name) { // 인덱스 찾아야 함
		for(int i=0; i<members.size(); i++) {
			if(name.equals(members.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printAllMembers() {
		view.printAllMembers(members);
	}

	public void insertMember() {
		Grade g = view.insertMember();
		if(g==null) {
			view.noSearch();
		} else {
			members.add(g);
		}
	}
	
}
