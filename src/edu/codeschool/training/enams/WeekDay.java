package edu.codeschool.training.enams;

public enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    static void wakeUp(WeekDay weekDay) {
        switch (weekDay) {
            case SUNDAY:
                System.out.println("Wake up it is weekend");
            case MONDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case TUESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case WEDNESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case THURSDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case FRIDAY:
                System.out.println("Wake up and prepare for the work it is working day");
            case SATURDAY:
                System.out.println("Wake up it is weekend");

        }
    }
}