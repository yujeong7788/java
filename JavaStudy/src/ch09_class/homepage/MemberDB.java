package ch09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memList = new ArrayList<>();
	
	
	// 싱글톤 패턴 적용
	// 1. 기본 생성자의 접근 제어자를 private으로 막는다.
	// 기본 생성자에 실행 구문 추가하기 위해 작성해줌
	private MemberDB() {
		memList.add(new Member(makeStuId(),"a001","123a","배준호"));
		memList.add(new Member(makeStuId(),"a002","123b","고동욱"));
		memList.add(new Member(makeStuId(),"a003","123c","홍민경"));
	}
	// 2. 필드변수에 자기자신 객체를 소환한다.
	// static을 붙여주어야 다른 클래스에서 
	// 이 객체를 소환하지 않고 접근할 수 있다.
	// 접근 후 직접적으로 수정할 수 없게 private 처리
	private static MemberDB instance = new MemberDB(); // 보통 instance라고 줌
	
	// 3. instance에 대한 Getter 생성
	public static MemberDB getInstance() {
		return instance;
	}
	
	//학생 목록 조회
	public void showMemberList() {
		for(int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}
	
	// 학번 생성 메소드
	public String makeStuId() {
		return "202302300" + (memList.size() + 1);
		
	}
	
	// 회원가입 메소드
	public void registMember(Member mem) {
		memList.add(mem);
	}
	
	//memList에서 파라미터로 들어온
	//id와 pw가 일치하는 Member 객체를
	//찾아서 해당 Member 객체를 리턴
	//못찾았다면 null 리턴
	//login = memDB, login(id,pw);
	public Member login(String id, String pw) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).getId().equals(id) && memList.get(i).getPassword().equals(pw)) {
				
					
					
				return memList.get(i);
			}
		}
		return null;
	}

}
