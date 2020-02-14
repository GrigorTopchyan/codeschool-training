package edu.codeschool.training.classes_objects.HomeWork7.task2;

public abstract class AbstractMonster implements Monster {

    private String name;

    public AbstractMonster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String attack();
}
