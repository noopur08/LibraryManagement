class Student implements Borrower,Reader {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook() {
        System.out.println(name + " is borrowing a book.");
    }

    @Override
    public void returnBook() {
        System.out.println(name + " is returning a book.");
    }

    @Override
    public void readBook() {
        System.out.println(name + " is reading a book.");
    }
}