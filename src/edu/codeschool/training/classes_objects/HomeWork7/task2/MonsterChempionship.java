package edu.codeschool.training.classes_objects.HomeWork7.task2;

public class MonsterChempionship {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new FireMonster("Fire Monster");
        monsters[1] = new StoneMonster("Stone Monster");
        monsters[2] = new WaterMonster("Water Monster");
        for (Monster Monster : monsters) {
            System.out.println(Monster.attack());
          }
    }
}
