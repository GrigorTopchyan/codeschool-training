package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

    }

    public void Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //վալիդացիաներ արա
    //այսինքն day - ը պիտի լինի 0 - 31, նույնը մնացած դաշտերի համար

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
       // if (day > 31 || day < 1) {
            this.day = day;
        }
        //Ստեղ եթե վալիդ day չի տպի որ user ը իմանա
   // }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        // || օպերատորը պիտի օգտագործեիր ոչ թե &&
       // if (month > 12 || month < 1) {
            this.month = month;
        }
   // }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
      //  if (year < 1 || year == 0) {
            this.year = year;
        }
   // }

    //Էս մեթոդը պիտի տվյալ օբյեկտի year դաշտը ավելացնեի տրված քանակով ոչ թե վերադարձնի
    public String plusYear(int year) {
        int sumYear = getYear() + year;
        return "[" + getDay() + "/" + getMonth() + "/" + sumYear + "]";
    }


    //Էս մեթոդը պիտի տվյալ օբյեկտի year դաշտը ավելացնեի տրված քանակով ոչ թե վերադարձնի
    //պետք չի ինչ որ բան տպի
    public String plusDay(int day) {
        int sumDay = getDay() + day;
        if (sumDay <= 0 || sumDay > 31) {

        }
        return "[" + sumDay + "/" + getMonth() + "/" + getYear() + "]";
    }

    public String toString() {
        return "[" + day + "/" + month + "/" + year + "]";
    }
}





