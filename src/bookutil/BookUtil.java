package bookutil;

import java.util.Scanner;

import book.Book;
import book.BookStore;
import book.InvalidBookException;

public class BookUtil {
	public static void main(String args[]) {
		String bookID;
		String title;
		String author;
		String category;
		float price;
		BookStore bookData = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		int userinput = 0;
		boolean exituser = true;
		do {
		System.out.println("===== Welcome To Book Management ======");
		System.out.println("press 1 to add new book");
		System.out.println("press 2 to Search Book by author");
		System.out.println("press 3 to Search Book by title");
		System.out.println("press 4 to Display All Books");
		if(sc.hasNextInt()) {
		    userinput = sc.nextInt();
		}else {
			exituser = false;
		}
		switch(userinput) {
			case 1:
				sc.nextLine();
				System.out.println("BookID: ");
				bookID = sc.nextLine();
				System.out.println("title: ");
				title = sc.nextLine();
				System.out.println("author: ");
				author = sc.nextLine();
				System.out.println("category: ");
				category = sc.nextLine();
				System.out.println("price: ");
				price = sc.nextFloat();
				try {
					Book bookinfo = new Book(bookID, title, author, category, price);
					bookData.addBook(bookinfo);
					System.out.println("Book Added Successfully");
				} catch (InvalidBookException e) {
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Author Name: ");
				author = sc.nextLine();
				bookData.searchByAuthor(author);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Book Title: ");
				title = sc.nextLine();
				bookData.searchByAuthor(title);
				break;
			case 4:
				bookData.displayAll();
				break;
			default:
				System.out.println("Choose a Correct option");
				
		}
		}while(exituser);
		
	}
}
