package HomeWork7.HomeTask2;

public class WaterMonster extends AbstractMonster {
    public WaterMonster(String name) {
        super(name);

    }




    @Override
    public String attack() {
        System.out.println("Attack with Water");
        return super.attack();

    }
}
