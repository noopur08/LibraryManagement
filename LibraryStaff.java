public class LibraryStaff extends LibraryManagement {
    private String department;

    // Constructor
    public LibraryStaff(String name, int employeeID, String department) {
        super(name, employeeID);
        this.department = department;
        // Assigning privileges for LibraryStaff
        setCanIssueBooks(false);
        setCanDeleteBooks(false);
        setCanStoreBooks(true);
        setCanSortBooks(false);
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

    // Additional method for LibraryStaff
    public void displayDepartment() {
        System.out.println("Department: " + department);
    }
}
