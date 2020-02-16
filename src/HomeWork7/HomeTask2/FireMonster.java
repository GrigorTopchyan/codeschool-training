package HomeWork7.HomeTask2;

public class FireMonster extends AbstractMonster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        System.out.println("Attack with Fire");
        return super.attack();
    }
}
