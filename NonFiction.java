public class NonFiction extends Book {

    public NonFiction(String title, String author, int publicationYear, int ISBN, String subject) {
        super(title, author, publicationYear, ISBN);

    }

    // Additional methods specific to NonFiction

    public class Autobiography extends Book {


        public Autobiography(String title, String author, int publicationYear, int ISBN, String subject, String person) {
            super(title, author, publicationYear, ISBN);

        }

        // Additional methods specific to Autobiography
    }

    public class Biography extends Book {

        public Biography(String title, String author, int publicationYear, int ISBN, String subject, String subjectPerson) {
            super(title, author, publicationYear, ISBN);

        }

        // Additional methods specific to Biography
    }
}
