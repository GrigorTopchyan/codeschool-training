package edu.codeschool.training.classes_objects.HomeWork7.task2;

public class FireMonster extends AbstractMonster {
    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return this.getName()+ " everything makes fire";
    }
}
