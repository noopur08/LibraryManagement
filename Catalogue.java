public class Catalogue {
    private Book[] books;
    private int capacity;
    private int count;

    public Catalogue(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < capacity) {
            books[count++] = book;
        } else {
            System.out.println("Catalogue is full. Cannot add more books.");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(title)) {
                // Shift books to the left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found in catalogue.");
    }

    public Book searchBookByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }

    public Book[] getBooks() {
        return books;
    }
}
