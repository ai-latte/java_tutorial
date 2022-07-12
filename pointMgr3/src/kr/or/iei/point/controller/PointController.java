package kr.or.iei.point.controller;

public interface PointController {
	
	// 메인메뉴가 출력되는 메서드
	public void main();
	// 회원정보 등록
	public void insertMember();
	// 회원정보 전체출력
	public void printAllMember();
	// 회원 1명 찾아서 출력
	public void printOneMember();
	// 회원정보 수정
	public void updateMember();
	// 회원정보 삭제
	public void deleteMember();
	// 매개변수로 받은 이름이 배열에 몇 번째에 있는지 찾아서 인덱스 리턴
	public int searchMember(String name);

}
