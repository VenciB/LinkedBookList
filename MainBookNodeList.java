package by.htp.collectionexample.run;

public class MainBookNodeList {

	public static void main(String[] args) {
				
		Book book1 = new Book( 1, "Be Happy!", "Vencislav", 2018 );
		Book book2 = new Book( 2, "Nice weather", "Elena", 2015 );
		Book book3 = new Book( 3, "Tomorrow", "Yaroslav", 2009 );
		Book book4 = new Book( 4, "Fast train", "Svetlana", 2010 );
		
		BookLinkedList newList = new BookLinkedList( );

		newList.addBook(book1);
		newList.addBook(book2);
		newList.addBook(book3);
		newList.addBook(book4);
		
		newList.showAllBooksForward();
		System.out.println("Number of books: "+ newList.getNumOfBooks());
		
		System.out.println( "========================" );
		newList.deleteBook( 3 );
		System.out.println( "========================" );
		
		newList.showAllBooksForward();
		System.out.println("Number of books: "+ newList.getNumOfBooks());
	}

}
