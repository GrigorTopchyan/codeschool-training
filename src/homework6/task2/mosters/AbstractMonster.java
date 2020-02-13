package homework6.task2.mosters;

import homework6.task2.imosters.IMonsters;

/**
 * class AbstractMonster which implements Monster interface and has the name field of type String
 */
public abstract class AbstractMonster implements IMonsters {
    private String name;

    public AbstractMonster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
