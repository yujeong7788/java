package ch09_class.homepage;

import java.util.Scanner;

public class HomepageMain {

	public static void main(String[] args) {
	

		MemberDB memDB = MemberDB.getInstance();
//		MemberDB memDB = MemberDB.instance; // 직접 접근하니까 변할 수 있ㅇ
		memDB.showMemberList();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
			System.out.println(">>> ");
			
			int command = Integer.parseInt(scan.nextLine());
			
			if(command ==1) {
				//TODO 회원가입
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>> ");
				String pw = scan.nextLine();
				
				System.out.println("이름을 입력해주세요");
				System.out.println(">>> ");
				String name = scan.nextLine();
				
				Member mem = new Member(memDB.makeStuId(),id,pw,name);
				memDB.registMember(mem);
				
				
				
			}else if(command ==2) {
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력해주세요");
				System.out.println(">>> ");
				String pw = scan.nextLine();
				
				//TODO 로그인
				Member login = memDB.login(id,pw);
				
				if(login != null) {
					//로그인 성공
					System.out.println("로그인 성공!");
					System.out.println(login.getName()+"님환영합니다.");
					
					//게시판
					//게시판목록
					//글쓰기
					//글조회
					//로그아웃
				}else{
					System.out.println("아이디 혹은 비밀번호가 틀립니다.");
				}
				
				
				
				
				
			}else if(command ==3) {
				// 회원목록 조회
				memDB.showMemberList();
			}else {
				//종료
				System.out.println("종료");
				break;
			}
		}
	}

}
