package edu.training.codeschool.classes_objects.homework4;

public class Time {
    //դաշտերը պիտի private լինեն encapsulation չես պահել
    public int hour;
    public int minute;
    //second խիա ստատի՞կ
    public static int second;

    //վալիդացիաներ արա
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        //|| պիտի լինի ոչ թե &
        // մանցած տեղերն էլ կդզես
        if (hour > 0 & hour < 24) ;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 0 & minute < 60) ;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 0 & second < 60) ;
        this.second = second;
    }

    //nextSecond ը չպիտի ստանա պարամետեր
    //պիտի սարքի նոր Time տիպի օբյեկտ եղած օբյեկտից(this) ից որի second ը մի վառկյան ավելա եղածից
    public void nextSecond(Time time) {
        time.second++;
    }

    //նույնը էս մեկի համար
    public void previusSecond(Time time) {
        time.second--;

    }

    @Override
    public String toString() {
        return "hh:" + hour +
                " mm: " + minute +
                " ss: " + second;
    }
}
