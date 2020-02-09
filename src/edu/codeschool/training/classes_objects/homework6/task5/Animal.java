package edu.codeschool.training.classes_objects.homework6.task5;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    abstract public String greeting();
}


