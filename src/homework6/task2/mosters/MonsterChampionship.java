package homework6.task2.mosters;

public class MonsterChampionship {
    public static void main(String[] args) {
        IMonsters[] monsters = new IMonsters[5];
        monsters[0] = new FireMonster("Fire Monster1");
        monsters[1] = new StoneMonster("Stone Monster1");
        monsters[2] = new WaterMonster("Water Monster");
        monsters[3] = new FireMonster("Fire Monster2");
        monsters[4] = new StoneMonster("Stone Monster2");
        for (IMonsters iMonsters : monsters) {
            System.out.println(iMonsters.attack());
        }
    }
}
