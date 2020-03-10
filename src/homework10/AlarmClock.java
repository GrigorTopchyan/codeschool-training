package homework10;

/**
 * 2.1 Create class AlarmClock.Which should have following method wakeUp(WeekDay weekDay)
 * This method prints on the console "Wake up and prepare for the work it is working day" if the day is working day
 * and "Wake up it is weekend " if it is weekend. Use swithch case for this.
 */
public class AlarmClock {
    public static void wakeUp(WeekDay weekDay) {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            default:
                System.out.println("Wake up it is weekend");
                break;
        }
    }
}
