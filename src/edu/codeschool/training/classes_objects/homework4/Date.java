package edu.codeschool.training.classes_objects.homework4;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

import static java.time.LocalDate.of;

public class Date {

    private int year;
    private  int day;
    private int month;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int plusYear(int year){
        return year * 2;
    }

    public int plusDay(int day){
        return day * 3;
    }

    public String toString(){
        return String.valueOf( year+"/"+ month+"/"+ day);
    }


//    public void increase(){
//        LocalDate sourceDate = of(1992, Month.OCTOBER, 9);
//
//        LocalDate destDate1 = sourceDate.plusYears(5);
//        System.out.println(destDate1);
//
//        LocalDate localDate2 = destDate1.plusDays(25);
//        System.out.println(destDate1);
//    }


    public void increaseYear(){
        int years = year + 5;
        int months = month;
        int days = day;
        System.out.println("Increase the date by 5 year :"+years+"/"+months+"/"+days);
    }

     public void increaseDate(){
         int years2 = year;
         int months2 = month;
         int days2 = (day+25)-31;
         System.out.println(" Increase the date by 25 day :"+years2+"/"+months2+"/"+days2);


     }

}
