package homework6.mosters;

public class FireMonster extends AbstractMonster{
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return this.getName()+ " sets fire to everything in its path";
    }
}
