package edu.training.codeschool.homework_for_12_02_2020.homework_2;

public class MonsterChempionship {
    public static void main(String[] args) {
        AbstractMonster abstractMonster = new AbstractMonster();
        Monster stoneMonster = new StoneMonster();
        WaterMonster waterMonster = new WaterMonster("Aang");
        FireMonster fireMonster = new FireMonster();
        System.out.println(abstractMonster.attack());
        System.out.println(waterMonster.attack());
        System.out.println(waterMonster.getName());
        System.out.print(fireMonster.attack());
    }
}
