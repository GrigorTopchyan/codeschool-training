package edu.training.codeschool.HomeWork;

public abstract class Person {
    //dashty piti private lini
    public String name;
    {
        name = "Jhon";
    }
    public String adress;
    {
        adress = "Jhon";
    }
    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public Person() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}