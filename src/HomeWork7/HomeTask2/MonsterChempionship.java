package HomeWork7.HomeTask2;

public class MonsterChempionship {
    public static void main(String[] args) {
        AbstractMonster MonsterWater=new WaterMonster("MonsterWater");
        MonsterWater.attack();
        AbstractMonster MonsterStone =new StoneMonster("MonsterStone");
        MonsterStone.attack();
        AbstractMonster MonsterFire = new FireMonster("MonsterFire");
        MonsterFire.attack();

    }
}
