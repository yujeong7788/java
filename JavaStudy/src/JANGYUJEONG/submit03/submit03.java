package JANGYUJEONG.submit03;

public class submit03 {
	
	public static void main(String[] args) {
		
		int result = 1;
		
		//Q01. 10!값을 구하기(for문 사용)
		for(int i = 1; i <= 10; i++) {
			result = result * i;
		}
		
		System.out.println(result);
		System.out.println("\n=======@문제======\n");
		
		// @문제 15!값을 구하기(for문 사용) 
		// hint ! 숫자가 길다
		
		long result2 = 1l;
		
		for(int i = 1; i <= 15; i++) {
			result2 = result2 * i;
		}
		
		System.out.println(result2);
		
		System.out.println("\n==========Q02.=========\n");
		
		//Q02. 월리가 몇개인지 찾기 
		//hint 언제 에러 나는지 확인
		int count = 0;
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		for(int i = 0; i < findWally.length(); i++) {
			if(i % 2 == 0) {
			String str = findWally.substring(i,i+2);
//			System.out.println(i + ":" + str);
			
			if(str.equals("월리")) {
				count++;
			}}
		}
		System.out.println("월리의 갯수: " + count);
		
		System.out.println("\n==========Q03.=========\n");
		
		//Q03. 거꾸로 트리를 5층 만들어주세요.
		String stars = "*****";
		for(int i = 0; i <= stars.length()-1; i++) {
			System.out.println(stars.substring(i));
			
		}
		

	}

	

}
