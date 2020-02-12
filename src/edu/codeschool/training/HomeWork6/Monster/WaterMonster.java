package edu.codeschool.training.HomeWork6.Monster;

public class WaterMonster extends AbstractMonster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return  super.attack() + " water";
    }
}
