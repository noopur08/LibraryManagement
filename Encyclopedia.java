public class Encyclopedia extends Book {
    private String edition;

    public Encyclopedia(String title, String author, int publicationYear, int ISBN, String edition) {
        super(title, author, publicationYear, ISBN);
        this.edition = edition;
    }

    // Additional methods specific to Encyclopedia
}
