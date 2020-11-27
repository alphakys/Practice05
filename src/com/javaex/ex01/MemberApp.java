package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
			Member my = new Member();
			Member mj = new Member();
			Member ml = new Member();
			
		
			my.setName("유재석");
			my.setId("yjs");
			my.setPoint(30000);
			
			
			mj.setName("정우성");
			mj.setId("jws");
			mj.setPoint(50000);
			
			
			ml.setName("이효리");
			ml.setId("lhr");
			ml.setPoint(40000);
			
			
			
			
			mj.showInfo();
			my.showInfo();
			ml.showInfo();
			
			
			
			
			
			
			
	}

}
