package edu.codeschool.training.HomeWork6.Monster;

public class MonsterChampionship {
    public static void main(String[] args) {
        WaterMonster monster1 = new WaterMonster("No1");
        StoneMonster monster2 = new StoneMonster("No2");
        FireMonster monster3 = new FireMonster("No3");
        System.out.println(monster2.attack());

    }
}
