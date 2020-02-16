package HomeWork7.HomeTask2;

public abstract class AbstractMonster implements Monster {
    public String name;

    public AbstractMonster(String name) {
        this.name = name;
        System.out.println(name);
    }

    @Override
    public String attack() {
        return name;
    }
}
