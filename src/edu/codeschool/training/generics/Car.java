package edu.codeschool.training.generics;


import java.util.Date;

public class Car <T> implements Comparable <Car> {
   private String name;
   private String model;
   private Date date;

    public Car(String name, String model,Date date) {
        this.name = name;
        this.model = model;
        this.date = date;
    }



    @Override
    public int compareTo(Car o) {
        if (this.date.compareTo(o.date) < 0) {
            return 1;
        } else if (this.date.compareTo(o.date) > 0) {
            return -1;
        }
        return 0;
    }
}
