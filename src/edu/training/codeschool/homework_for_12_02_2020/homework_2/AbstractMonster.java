package edu.training.codeschool.homework_for_12_02_2020.homework_2;

public class AbstractMonster implements Monster {
    public String name;

    public AbstractMonster(String name) {
        this.name = name;
    }
    public AbstractMonster(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  attack(){
        return "you are skull";
    }
}
