public class FineManager {
    private static final double FINE_PER_DAY = 1.0;

    public double calculateFine(int daysOverdue) {
        return daysOverdue * FINE_PER_DAY;
    }
}
