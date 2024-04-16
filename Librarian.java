public class Librarian extends LibraryManagement {
    private Book[] issuedBooks;
    private Book[] libraryInventory;
    private Borrower[] borrowers;
    private String[] searchHistory;
    private String[] catalogue;
    private int totalBooks;
    private int totalMagazines;
    private int totalJournals;
    private int totalTheses;
    private int issuedBooksCount;

    public Librarian(String name, int employeeID, int maxBooks, int maxInventory, int maxBorrowers, int maxSearchHistory, int maxCatalogue) {
        super(name, employeeID);
        issuedBooks = new Book[maxBooks];
        libraryInventory = new Book[maxInventory];
        borrowers = new Borrower[maxBorrowers];
        searchHistory = new String[maxSearchHistory];
        catalogue = new String[maxCatalogue];
        totalBooks = 0;
        totalMagazines = 0;
        totalJournals = 0;
        totalTheses = 0;
        issuedBooksCount = 0;
    }

    @Override
    public boolean canIssueBooks() {
        return true; 
    }

    @Override
    public boolean canDeleteBooks() {
        return true; 
    }

    @Override
    public boolean canStoreBooks() {
        return true; 
    }

    @Override
    public boolean canSortBooks() {
        return true; 
    }

    public void addBook(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            libraryInventory[totalBooks + totalMagazines + totalJournals + totalTheses] = book;
            catalogue[totalBooks + totalMagazines + totalJournals + totalTheses] = book.getTitle();
            if (book instanceof Magazine) {
                totalMagazines++;
            } else if (book instanceof Journal) {
                totalJournals++;
            } else if (book instanceof Thesis) {
                totalTheses++;
            } else {
                totalBooks++;
            }
        }
    }

    public void removeBook(Book book) {
        int index = findBook(book);
        if (index != -1) {
            if (book instanceof Magazine) {
                totalMagazines--;
            } else if (book instanceof Journal) {
                totalJournals--;
            } else if (book instanceof Thesis) {
                totalTheses--;
            } else {
                totalBooks--;
            }
            for (int i = index; i < libraryInventory.length - 1; i++) {
                libraryInventory[i] = libraryInventory[i + 1];
                catalogue[i] = catalogue[i + 1];
            }
            libraryInventory[libraryInventory.length - 1] = null;
            catalogue[catalogue.length - 1] = null;
        }
    }

    public void issueBook(Book book, Borrower borrower) {
        issuedBooks[issuedBooksCount++] = book;
    }

    public void returnBook(Book book, Borrower borrower) {
        int index = findIssuedBook(book);
        if (index != -1) {
            for (int i = index; i < issuedBooks.length - 1; i++) {
                issuedBooks[i] = issuedBooks[i + 1];
            }
            issuedBooks[issuedBooks.length - 1] = null;
            issuedBooksCount--;
        }
    }

    public void addBorrower(Borrower borrower) {
        for (int i = 0; i < borrowers.length; i++) {
            if (borrowers[i] == null) {
                borrowers[i] = borrower;
                break;
            }
        }
    }

    public void removeBorrower(Borrower borrower) {
        for (int i = 0; i < borrowers.length; i++) {
            if (borrowers[i] == borrower) {
                borrowers[i] = null;
                break;
            }
        }
    }

    private int findBook(Book book) {
        for (int i = 0; i < libraryInventory.length; i++) {
            if (libraryInventory[i] == book) {
                return i;
            }
        }
        return -1;
    }

    private int findIssuedBook(Book book) {
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i] == book) {
                return i;
            }
        }
        return -1;
    }
}
