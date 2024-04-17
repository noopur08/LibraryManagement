public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int publicationYear;
    private boolean issued;
    private boolean reserved;

    public Book(String title, String author, int publicationYear, int ISBN) {
        if(title == null || author == null) {
            throw new IllegalArgumentException("Title and author cannot be null");
        }

        if (publicationYear > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Publication year cannot be in the future");
        }
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.issued = false;
        this.reserved = false;
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

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
