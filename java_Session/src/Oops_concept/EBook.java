package Oops_concept;

	public class EBook extends Book {
	    private double fileSize; // in MB

	    public EBook(String title, String author, double price, int publicationYear, double fileSize) {
	        super(title, author, price, publicationYear);
	        this.fileSize = fileSize;
	    }

	    public double getFileSize() {
	        return fileSize;
	    }

	    public void setFileSize(double fileSize) {
	        this.fileSize = fileSize;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println(", File Size: " + fileSize + " MB");
	    }

	    @Override
	    public double discountedPrice(double discountPercentage) {
	        return super.discountedPrice(discountPercentage + 10); // Additional 10% discount for eBooks
	    }
    @Override
    public void read() {
        System.out.println("Reading the eBook: " + getTitle());
    }

    @Override
    public String getSummary() {
        return "eBook Title: " + getTitle() + ", Author: " + getAuthor() + ", File Size: " + getFileSize() + " MB";
    }
}

