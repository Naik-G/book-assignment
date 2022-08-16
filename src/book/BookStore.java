package book;

public class BookStore{
	
	Book theBooks[] = new Book[100];
	int bookscount;
	public void addBook(Book b) {
			theBooks[bookscount++] = b;
	}
	public void searchByTitle(String title) {
		if(bookscount!=0) {
			for(int i =0; i<theBooks.length;i++) {
				if(theBooks[i].title == title) {
					if(theBooks[i] != null) {
						System.out.println("=================================================");
						System.out.println("BOOK ID | BOOK TITLE | BOOK AUTHOR | BOOK CATEGORY | BOOK PRICE");
					System.out.println(theBooks[i].bookID + " | "+theBooks[i].title+ " | "+theBooks[i].author+ " | "+theBooks[i].category+ " | "+theBooks[i].price);
					System.out.println("=================================================");
					}else {
						return;
					}
				}
			}
		}else {
			System.out.println("No Books Available !");
		}
		
	}
	public void searchByAuthor(String author) {
		if(bookscount!=0) {
		for(int i =0; i<theBooks.length;i++) {
			if(theBooks[i] != null) {
			if(theBooks[i].author == author) {
				System.out.println("=================================================");
				System.out.println("BOOK ID | BOOK TITLE | BOOK AUTHOR | BOOK CATEGORY | BOOK PRICE");
				System.out.println(theBooks[i].bookID + " | "+theBooks[i].title+ " | "+theBooks[i].author+ " | "+theBooks[i].category+ " | "+theBooks[i].price);	
				System.out.println("=================================================");
			}
			}else {
				return;
			}
		}
		}else{
			System.out.println("No Books Available !");
		}
	}
	public void displayAll() {
		if(bookscount != 0) {
		for(int i =0; i<theBooks.length;i++) {
			if(theBooks[i] != null) {
				System.out.println("=================================================");	
				System.out.println("All Books Records");
				System.out.println("=================================================");
				System.out.println("BOOK ID | BOOK TITLE | BOOK AUTHOR | BOOK CATEGORY | BOOK PRICE");
			System.out.println(theBooks[i].bookID + " | "+theBooks[i].title+ " | "+theBooks[i].author+ " | "+theBooks[i].category+ " | "+theBooks[i].price);
			System.out.println("=================================================");
			}else {
				return;
			}
		}
		}else {
			System.out.println("No Books Found");
		}
	}
}
