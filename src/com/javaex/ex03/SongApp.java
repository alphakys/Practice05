package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		//출력결과를 예상해서 주석으로 작성해 보세요
		
		
		//Song 클래스에 생성자 파라미터 6개 짜리를 생성할 때 this 예약어를 통해 파라미터 5개 생성자를 불러서 파라미터 6개 생성자를 만들었기 때문에
		// 5개 생성자의 출력물을 불러오기 때문에 Song(파라미터 5개)가 먼저 출력되고 이후에 파라미터 6개라는 것이 출력됩니다
		
		
		
		
		s1.setArtist("강용수");
		
		
		System.out.println(s1.toString()); 
		
	}
			
}


