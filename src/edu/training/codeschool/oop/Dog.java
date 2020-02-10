package edu.training.codeschool.oop;

public class Dog extends Animal {

    public Dog(Eagle eagle){
        System.out.println("Dog Default");
    }

    @Override
    public String toString() {
        return "voice = " + this.voice +", " +  super.toString();
    }

    @Override
    void move() {
        System.out.println("Dog is moving");
    }


    public Dog(String name, int age, String voice) {
        super(name);
        System.out.println("Dog");
        this.voice = voice;
    }

    private String voice = "bark";

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
