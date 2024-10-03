package Oops_concept;

	import java.util.ArrayList;

	public class Library {
	    private ArrayList<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void displayAllBooks() {
	        for (Book book : books) {
	            book.displayInfo();
	        }
	    }

	    public Book findBookByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null; // Book not found
	    }

	    public static void main(String[] args) {
	        Library library = new Library();
	        
	        Book book1 = new Book("java programming", "onkar", 199.9, 2012);
	        EBook ebook1 = new EBook("java", "srikanth", 9.99, 2016, 2.5);

	        library.addBook(book1);
	        library.addBook(ebook1);
	        
	        library.displayAllBooks();
	        
	        Book foundBook = library.findBookByTitle("java");
	        if (foundBook != null) {
	            System.out.println("Found: " + foundBook.getSummary());
	        } else {
	            System.out.println("Book not found.");
	        }
	    }
	}


