public abstract class LibraryManagement {
    protected String name;
    protected int employeeID;
    protected boolean canIssueBooks;
    protected boolean canDeleteBooks;
    protected boolean canStoreBooks;
    protected boolean canSortBooks;

    public LibraryManagement(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public abstract boolean canIssueBooks();

    public abstract boolean canDeleteBooks();

    public abstract boolean canStoreBooks();

    public abstract boolean canSortBooks();

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public boolean getCanIssueBooks() {
        return canIssueBooks;
    }

    public void setCanIssueBooks(boolean canIssueBooks) {
        this.canIssueBooks = canIssueBooks;
    }

    public boolean getCanDeleteBooks() {
        return canDeleteBooks;
    }

    public void setCanDeleteBooks(boolean canDeleteBooks) {
        this.canDeleteBooks = canDeleteBooks;
    }

    public boolean getCanStoreBooks() {
        return canStoreBooks;
    }

    public void setCanStoreBooks(boolean canStoreBooks) {
        this.canStoreBooks = canStoreBooks;
    }

    public boolean getCanSortBooks() {
        return canSortBooks;
    }

    public void setCanSortBooks(boolean canSortBooks) {
        this.canSortBooks = canSortBooks;
    }
}
