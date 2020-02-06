package homework5.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        return super.getName() +" is purring";
    }
}
