package edu.codeschool.training.homework7.wrappers;

public class Double {
    double x;

    double multipliedOther(double other){
        return  this.x * other;
    }
    public void increment(){
        System.out.println((x + 10));
    }
    double percent(int percent){
        return (x * percent)/100;
    }
}
