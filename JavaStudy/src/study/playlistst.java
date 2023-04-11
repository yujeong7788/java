package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class playlistst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스",
				"언제나 사랑해: 케이시", "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE",
				"회전목마: sokodomo", "너, 너: 휘인", "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진",
				"Counting Stars: 비오", "신호등: 이무진", "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅",
				"Can't Control Myself: 태연", "Next Level: aespa", "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅",
				"드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식", "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단",
				"Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스", "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션",
				"Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		for (int i = 0; i < playList.size(); i++) {
		System.out.println(playList.get(i));
		}
		// 정렬순서 : ABC abc 가나다
		Collections.sort(playList);
		
		System.out.println("\n============ 검색 ===========\n");

		// 검색어를 입력받으면 playList에서
		// 해당 검색어를 포함하는 데이터를 담은 ArrayList를 리턴
		
		Scanner scan = new Scanner(System.in);
		String search = "태연";
		ArrayList<String> searchList = new ArrayList<>();
		for(int i = 0; i < playList.size(); i++) {
			if(playList.get(i).contains(search)) {
				searchList.add(playList.get(i));
			}	
		}
		for(int i = 0; i<searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
		
		
		
	}

}
