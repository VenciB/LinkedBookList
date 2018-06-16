package by.htp.collectionexample.run;

public class BookLinkedList {
	
	private Node first;
	private Node last;
	private int numOfBooks;
	
	/**
	 * constructor:
	 */
	public BookLinkedList( ) {
		first = null;
		last = null;
		numOfBooks = 0;
	}
	
	/**
	 * add new book in list:
	 * @param book
	 */
	public void addBook( Book book ) {
		
		Node newNode = new Node( last, book, null );
		
		if( first == null ) {
			first = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
		numOfBooks++;
		
	} // end addBook
	
	/**
	 * print all the books in list informaton:
	 */
	public void showAllBooksForward( ) {
		
		Node current = first;
		
		while( current != null ) {
			current.printNodeBook();
			current = current.next;
		}
	}
	
	/**
	 * delete one book from the list 
	 * with the book_id
	 * @param book_id
	 */
	public void deleteBook( int book_id ) {
		Node current = first;
		
		while( current.nodeBook.getBook_id() != book_id ) {
			current = current.next;
			if( current == null ) {
				System.out.println("No book with id " + book_id + " found.");
				return;
			}
		} // end while 
		
		if( current == first ) {
			first = current.next;
			current.next.previous = null;
		} else if( current == last ) {
			last = current.previous;
			current.previous.next = null;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		numOfBooks--;
		System.out.println("Book with id " + book_id + " was removed.");
	} // end deleteBook

	
	public Node getFirst() {
		return first;
	}

	
	public Node getLast() {
		return last;
	}

	
	public int getNumOfBooks() {
		return numOfBooks;
	}

}