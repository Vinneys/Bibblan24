package src;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int isbn;
    private Boolean isBorrowed = false;
    private String information;

    public Book(String title, String author, String publisher, int isbn, Boolean isBorrowed, String inforamtion) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
        this.information = information;


    }

    public String getTitle() {
        return title;
    }
    public String getInformation(){
        return information;
    }
    public String setInformation(String information) {
        this.information = information;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = Integer.parseInt(isbn);
    }

    public Boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }
    public void showBooksDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Isbn: " + isbn);
        System.out.println("Borrowed: " + isBorrowed);

    }

}
