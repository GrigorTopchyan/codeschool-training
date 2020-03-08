package Weeks;

public class AlarmClock {
    public void wakeUp(WeekDay weekDay) {
        switch (weekDay) {
            case FRIDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case MONDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case TUESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case THURSDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case WEDNESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case SUNDAY:
                System.out.println("Wake up it is weekend ");
            case SATURDAY:
                System.out.println("Wake up it is weekend ");
        }
    }
}
