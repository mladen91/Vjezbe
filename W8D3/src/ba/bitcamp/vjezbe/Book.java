package ba.bitcamp.vjezbe;

public class Book {

	private String bookName;
	private String author;
	private int year;
	

	public Book(String bookName, String author, int year) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.year = year;
	}
	

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}


	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", year="
				+ year + "]";
	}
	
	
	
	
	
	
}
