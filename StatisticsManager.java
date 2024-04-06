public class StatisticsManager {
    private int totalBooks;
    private int totalMagazines;
    private int totalJournals;
    private int totalTheses;
    private int issuedBooksCount;

    public void updateStatistics(Book book) {
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

    public String generateStatistics() {
        return "Total Books: " + totalBooks + "\n" +
                "Total Magazines: " + totalMagazines + "\n" +
                "Total Journals: " + totalJournals + "\n" +
                "Total Theses: " + totalTheses + "\n" +
                "Total Items Issued: " + issuedBooksCount;
    }
}
