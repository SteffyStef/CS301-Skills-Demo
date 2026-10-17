import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        LocalDate.of(year, month, day);

        this.month = month;
        this.day = day;
        this.year = year;
    }
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public String getDayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public long daysBetween(CustomDate other) {
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.of(other.year, other.month, other.day);

        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }

    public static void main(String[] args) {

        CustomDate date1 = new CustomDate(10, 16, 2026);
        CustomDate date2 = new CustomDate(10, 20, 2026);

        System.out.println("First date: " + date1);
        System.out.println("Second date: " + date2);

        System.out.println("Day of the week: " + date1.getDayOfWeek());

        System.out.println("Days between dates: " + date1.daysBetween(date2));
    }

}
