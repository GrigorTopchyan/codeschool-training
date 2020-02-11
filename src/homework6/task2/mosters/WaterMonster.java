package homework6.task2.mosters;

public class WaterMonster extends AbstractMonster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return this.getName()+" attacks ships";
    }
}
