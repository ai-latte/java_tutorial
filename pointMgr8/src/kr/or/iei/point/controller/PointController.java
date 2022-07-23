package kr.or.iei.point.controller;
import kr.or.iei.point.vo.*;
import java.util.ArrayList;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Grade;

public class PointController {
	private ArrayList<Grade> members;
	private PointView view;
	
	public PointController() {
		super();
		members = new ArrayList<Grade>();
		view = new PointView();
	}
	
	public void main() {
		while(true){
			int sel = view.getSel();
			switch(sel){
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
				break;
			default :
				return;
			}
		}
	}

	public void updateMember() {
		String name = view.getMemberName("수정");
		Grade g = checkMember(name);
		Grade updateG = view.updateMember();
		g.setName(updateG.getName());
		g.setGrade(updateG.getGrade());
		g.setPoint(updateG.getPoint());
	}

	public void printOneMember() {
		String name = view.getMemberName("조회");
		Grade g = checkMember(name);
		view.printOneMember(g);
	}

	private Grade checkMember(String name) {
		for(Grade g : members){
			if(name.equals(g.getName())) {
				return g;
			}
		}
		view.noSearchMember();
		return null;
	}
	
	public void printAllMember() {
		view.printAllMember(members);
	}

	public void insertMember() {
		Grade g = view.insertMember();
		if(g == null) {
			view.noSearchMember();
		} else{
			members.add(g);
		}
	}
}
