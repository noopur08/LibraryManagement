public class BookInventory {
    private Book[] books;
    private int count;

    public BookInventory(int maxSize) {
        books = new Book[maxSize];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Inventory is full. Cannot add more books.");
        }
    }

    public int getCount() {
        return count;
    }

    public Book[] getBooks() {
        return books;
    }
}
