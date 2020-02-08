package edu.training.codeschool.oop;

public abstract class Animal extends Object{
     private String name;
     private int age;

    public Animal() {
        System.out.println("Default Animal");
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public Animal(String name) {
        System.out.println("Animal");
        this.name = name;
    }

    private void breath(){
        System.out.println("Animal is breathing");
    }

      abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
