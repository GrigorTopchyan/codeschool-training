/*
 4.1 Create class Shape which contains:
    Two instance variables color (String) and filled (boolean).
    Two constructors: a no-arg (no-argument) constructor that initializes the color to "green" and filled to true,
    and a constructor that initializes the color and filled to the given values.
    Getter and setter for all the instance variables.
    A toString() method that returns "A Shape with color of xxx and filled/Not filled".
 */


package edu.codeschool.training.classes_objects.homework5;

public class Shape1 {



   private boolean filled = true;
   private String color = "color";


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Shape1(){
    }

    public Shape1(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String toString()
    {
        String isNot = "";
        if(!isFilled())
        {
            isNot = "not ";
        }
        return "A Shape with color of " + color + " and is " + isNot + " filled. ";
    }
}



