public class SearchEngine {
    public Book search(String title, Book[] books) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }


    public Book search(int ISBN, Book[] books) {
        for (Book book : books) {
            if (book != null && book.getISBN() == ISBN) {
                return book;
            }
        }
        return null;
    }

    public Book search(String title, String author, Book[] books) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public Book search(String title, String author, int ISBN, Book[] books) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title) && book.getAuthor().equals(author) && book.getISBN() == ISBN) {
                return book;
            }
        }
        return null;
    }
}
