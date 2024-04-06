class Magazine implements Book {
    private String title;
    private String publisher;
    private int issueNumber;

    public Magazine(String title, String publisher, int issueNumber) {
        this.title = title;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public void displayDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue Number: " + issueNumber);
    }

    public String getTitle() {
        return title;
    }
}
