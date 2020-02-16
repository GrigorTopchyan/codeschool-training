package HomeWork7.HomeTask2;

public class StoneMonster extends AbstractMonster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        System.out.println("Attack with Stone");
        return super.attack();
    }
}
