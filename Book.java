package by.htp.collectionexample.run;

public class Book {

	private int book_id;
	private String title;
	private String author;
	private int yearOfPublishing;
	
	/**
	 * CONSTRUCTOR
	 * @param book_id
	 * @param title
	 * @param author
	 * @param yearOfPublishing
	 */
	public Book( int book_id, String title, String author, int yearOfPublishing ) {
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
	} // end constructor

	public int getBook_id() {
		return book_id;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
}