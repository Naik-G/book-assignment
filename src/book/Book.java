package book;

import java.util.Arrays;

public class Book {
	public String bookID;
	public String title;
	public String author;
	public String category;
	public float price;
	String[] bookCategory = {"Science","Fiction","Technology","Others"};
	
	public Book(String bookID,String title,String author,String category,float price) throws InvalidBookException{
		if(bookID.charAt(0)=='B' && bookID.length()>3) {
			this.bookID = bookID;	
		}else {
			throw new InvalidBookException("Book ID must start with B and length should be 4 digit");
		}
		if(Arrays.asList(bookCategory).contains(category)) {
			this.category = category;	
		}else {
			System.out.println("Book Category must be: ");
			for(int i = 0; i<bookCategory.length;i++) {
				System.out.print(bookCategory[i] + ", ");
			}
			throw new InvalidBookException(category + "is Invalid Book Category");
		}
		if(price>0) {
			this.price = price;
		}else {
			throw new InvalidBookException("Price Cannot be less than zero");
		}
		this.title = title;
		this.author = author;
	}
}
