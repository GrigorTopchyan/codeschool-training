package edu.codeschool.training.HomeWork6.Monster;

import edu.codeschool.training.HomeWork6.Monster.Monster;

public class  AbstractMonster implements Monster {
    String name;

    public AbstractMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return name + " attack in " ;
    }
}
