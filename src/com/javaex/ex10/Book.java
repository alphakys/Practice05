package com.javaex.ex10;

public class Book {
    
    
  private static int bookNo;
  private static String title;
  private static String author;
  int stateCode;
    
    ////////////////////////////////
    public Book (int bookNo, String title, String author) {
    			this.title = title;
    			this.author = author;
    			this.bookNo = bookNo;
    			this.stateCode=1;
    		}

    public Book() {}
    
    ///////////////////////////////////////
    
	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
    		
  
	
	
	
    	////////////////////////////////////	
    		
    		
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
	}




	
	public static void rent(Book book) {
		
		book.stateCode=0;
		System.out.println(book.title+"이(가) 대여됐습니다.");
		
		
	}
    		
    		
    		
    		
    		
    
}
