public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


}
