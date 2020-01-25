package edu.training.codeschool;

public class albert {
    public static void main (String[]args) {
        double a = -0.1;
    if (a>0){
        if (a<1) {
            System.out.println("smolle positive");
        }
        else if (a> 1000000) {
            System.out.println("large positive");
        }
        else {
            System.out.println("positiv");
        }

        }
    else if (a<0)
    {
        if (-a<1) {
            System.out.println("smole negativ");
        }
         else if (-a>1000000) {
            System.out.println("large negative");
        }
         else{
             System.out.println("negative");
        }

    }
    else {
        System.out.println("zero");
    }
            }

        }



