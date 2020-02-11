package homework6.task2.mosters;

public class StoneMonster extends AbstractMonster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return this.getName()+" throws huge stones";
    }
}
