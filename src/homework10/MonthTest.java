package homework10;

public class MonthTest {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println("name - " + month.getName() + " - order - " + (month.ordinal() + 1) + " - daysCount -" + month.getDaysCount());
        }
    }
}
