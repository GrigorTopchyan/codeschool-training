package edu.training.codeschool.homework_for_12_02_2020.homework_2;

public class WaterMonster extends AbstractMonster {
    public WaterMonster(String name) {
        super(name);
    }
    public String getName(){
        return name;
    }
    public String attack(){
        return ("Water!");

    }
}
