package edu.codeschool.training.classes_objects.HomeWork7.task2;

public class StoneMonster extends AbstractMonster {

    public StoneMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return this.getName()+ "throws huge stones";
    }
}
