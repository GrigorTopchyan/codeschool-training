package edu.codeschool.training.HomeWork6.Monster;

public class StoneMonster extends AbstractMonster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.attack() + " stone";
    }
}
