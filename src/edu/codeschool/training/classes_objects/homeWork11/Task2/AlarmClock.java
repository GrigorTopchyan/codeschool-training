package edu.codeschool.training.classes_objects.homeWork11.Task2;

public class AlarmClock {
    WeekDay weekDay;

    private void   WeekUp(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    public static void main(String[] args) {

       WeekDay weekday = WeekDay.MONDAY;
        switch (weekday) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Wake up it is weekend");
                break;
        }
    }
}


