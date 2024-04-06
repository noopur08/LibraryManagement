public class Librarian extends LibraryManagement {
    private int booksManaged;

    // Constructor
    public Librarian(String name, int employeeID, int booksManaged) {
        super(name, employeeID);
        this.booksManaged = booksManaged;
        // Assigning privileges for Librarian
        setCanIssueBooks(true);
        setCanDeleteBooks(true);
        setCanStoreBooks(true);
        setCanSortBooks(true);
    }

    // Override abstract methods
    @Override
    public boolean canIssueBooks() {
        return canIssueBooks;
    }

    @Override
    public boolean canDeleteBooks() {
        return canDeleteBooks;
    }

    @Override
    public boolean canStoreBooks() {
        return canStoreBooks;
    }

    @Override
    public boolean canSortBooks() {
        return canSortBooks;
    }

    // Additional method for Librarian
    public void manageBooks(int numberOfBooks) {
        this.booksManaged += numberOfBooks;
        System.out.println("Total books managed by Librarian: " + booksManaged);
    }
}
