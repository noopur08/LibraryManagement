public class Membership {
    private String type;
    private int maxBorrowLimit;
    private int maxDaysLimit;

    public Membership(String type, int maxBorrowLimit, int maxDaysLimit) {
        this.type = type;
        this.maxBorrowLimit = maxBorrowLimit;
        this.maxDaysLimit = maxDaysLimit;
    }

    public String getType() {
        return type;
    }

    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    public int getMaxDaysLimit() {
        return maxDaysLimit;
    }
}
