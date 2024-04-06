public class SearchEngine {
    public Book searchByTitle(String title, Catalogue catalogue) {
        for (int i = 0; i < catalogue.getCount(); i++) {
            if (catalogue.getBooks()[i].getTitle().equals(title)) {
                return catalogue.getBooks()[i];
            }
        }
        return null;
    }

    public Book searchByISBN(Integer ISBN, BookInventory bookInventory) {
        for (int i = 0; i < bookInventory.getCount(); i++) {
            if (Integer.valueOf(bookInventory.getBooks()[i].getISBN()).equals(ISBN)) {
                return bookInventory.getBooks()[i];
            }
        }
        return null;
    }
}
