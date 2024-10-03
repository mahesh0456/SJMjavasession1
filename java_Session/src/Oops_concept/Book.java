package Oops_concept;

public class Book implements Readable
{ 
	    private String title;
	    private String author;
	    private double price;
	    private int publicationYear;

	    public Book(String title, String author, double price, int publicationYear) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.publicationYear = publicationYear;
	    }

	    // Getters and Setters
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

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public int getPublicationYear() {
	        return publicationYear;
	    }

	    public void setPublicationYear(int publicationYear) {
	        this.publicationYear = publicationYear;
	    }

	    public void displayInfo() {
	        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Year: " + publicationYear);
	    }

	    public double discountedPrice(double discountPercentage) {
	        return price * (1 - discountPercentage / 100);
	    }
@Override
public void read() {
    System.out.println("Reading the book: " + getTitle());
}

@Override
public String getSummary() {
    return "Book Title: " + getTitle() + ", Author: " + getAuthor();
}
}


