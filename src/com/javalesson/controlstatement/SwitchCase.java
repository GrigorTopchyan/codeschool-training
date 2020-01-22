package com.javalesson.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "Mondey":
                System.out.println("This is first working day");
                break;
            case "Thuesday":
                System.out.println("This is second working day");
                break;
            case "Whednesday":
                System.out.println("This is third working day");
                break;
            case "Thursday":
                System.out.println("This is fourth working day");
                break;
            case "Friday":
                System.out.println("This is fifth working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Finally weekend");
                break;
            default:
                System.out.println("Not a day of the week");
        }
    }
}
