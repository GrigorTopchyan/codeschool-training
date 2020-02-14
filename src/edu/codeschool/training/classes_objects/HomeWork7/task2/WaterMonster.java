package edu.codeschool.training.classes_objects.HomeWork7.task2;

public class WaterMonster extends AbstractMonster {

    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return this.getName()+" attacks ships";
    }
}
