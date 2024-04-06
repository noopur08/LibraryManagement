public class Librarian {
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

    public Librarian(int maxBooks, int maxInventory, int maxBorrowers, int maxSearchHistory, int maxCatalogue) {
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
        int index = findBookIndex(book);
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
        borrower.addBook(book);
    }

    public void returnBook(Book book, Borrower borrower) {
        int index = findIssuedBookIndex(book);
        if (index != -1) {
            for (int i = index; i < issuedBooks.length - 1; i++) {
                issuedBooks[i] = issuedBooks[i + 1];
            }
            issuedBooks[issuedBooks.length - 1] = null;
            issuedBooksCount--;
        }
        borrower.returnBook(book);
    }

    public String[] searchItem(String keyword) {
        String[] searchResult = new String[libraryInventory.length];
        int count = 0;
        for (Book item : libraryInventory) {
            if (item.getTitle().contains(keyword) || item.getAuthor().contains(keyword)) {
                searchResult[count++] = item.getTitle();
            }
        }
        return searchResult;
    }

    public String generateStatistics() {
        return "Total Books: " + totalBooks + "\n" +
                "Total Magazines: " + totalMagazines + "\n" +
                "Total Journals: " + totalJournals + "\n" +
                "Total Theses: " + totalTheses + "\n" +
                "Total Items Issued: " + issuedBooksCount;
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

    public void updateCatalogue() {
        // Update catalogue if needed
    }

    public void viewCatalogue() {
        for (String item : catalogue) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public void viewBorrowingHistory(Borrower borrower) {
        borrower.viewBorrowingHistory();
    }


    private int findBookIndex(Book book) {
        for (int i = 0; i < libraryInventory.length; i++) {
            if (libraryInventory[i] == book) {
                return i;
            }
        }
        return -1;
    }

    private int findIssuedBookIndex(Book book) {
        for (int i = 0; i < issuedBooks.length; i++) {
            if (issuedBooks[i] == book) {
                return i;
            }
        }
        return -1;
    }
}
