package homework5.animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        return super.getName()+" is barking";
    }
}
