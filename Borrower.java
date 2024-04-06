public class Borrower {
    private String name;
    private Book[] borrowedBooks;
    private int borrowedBooksCount;

    public Borrower(String name, int maxBorrowedBooks) {
        this.name = name;
        borrowedBooks = new Book[maxBorrowedBooks];
        borrowedBooksCount = 0;
    }

    public void addBook(Book book) {
        borrowedBooks[borrowedBooksCount++] = book;
    }

    public void returnBook(Book book) {
        int index = findBookIndex(book);
        if (index != -1) {
            for (int i = index; i < borrowedBooksCount - 1; i++) {
                borrowedBooks[i] = borrowedBooks[i + 1];
            }
            borrowedBooks[borrowedBooksCount - 1] = null;
            borrowedBooksCount--;
        }
    }

    public void viewBorrowingHistory() {
        System.out.println("Borrower: " + name);
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
    }

    private int findBookIndex(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == book) {
                return i;
            }
        }
        return -1;
    }
}
