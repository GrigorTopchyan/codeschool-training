package edu.codeschool.training.HomeWork6.Monster;

public class FireMonster extends AbstractMonster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.attack() + " fire";
    }
}
