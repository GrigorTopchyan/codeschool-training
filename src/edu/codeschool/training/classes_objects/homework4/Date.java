package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;


    //Constructor ներ Էլ սարքի ու իրանց մեջ վալիդացիաներ արա
    //այսինքն day - ը պիտի լինի 0 - 31, նույնը մնացած դաշտերի համար

    public int getDay() {
        return day;
    }

    public void setDay(int i) {
        // || օպերատորը պիտի օգտագործեիր ոչ թե &&
        if (day > 31 && day < 1) {
            this.day = day;
        }
        //Ստեղ եթե վալիդ day չի տպի որ user ը իմանա
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int i) {
        // || օպերատորը պիտի օգտագործեիր ոչ թե &&
        if (month > 12 && month < 1) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int i) {
        // || օպերատորը պիտի օգտագործեիր ոչ թե &&
        //year < 1 && year == 0
        if (year < 1 && year == 0) {
            //փոխանցել ես  i  փոփոխական բայց գրել ես this.year = year;
            this.year = year;
        }
    }

    //Էս մեթոդը պիտի տվյալ օբյեկտի year դաշտը ավելացնեի տրված քանակով ոչ թե վերադարձնի
    public String plusYear(int year) {
        int sumOfYears = year + getYear();
        return "[ " + sumOfYears + " / " + getMonth() + " / " + getDay() + " ]";
    }

    //Էս մեթոդը պիտի տվյալ օբյեկտի year դաշտը ավելացնեի տրված քանակով ոչ թե վերադարձնի
    //պետք չի ինչ որ բան տպի
    public String plusDay(int day) {
        int sumDays = getDay() + day;
        if (sumDays <= 0 || sumDays > 31) {
            //ստեղ պիտի ամիսը ավելացնի ոչ
            System.out.println("Day can't be > than 31 or < than 1");
            return "[ " + 0 + "0" + " / " + 0 + "0" + " / " + 0 + "0" + " ]";
        }
        return "[ " + getYear() + " / " + getMonth() + " / " + sumDays + " ]";
    }

   // public String toString() {

  //  }
}





