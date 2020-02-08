package HomeWork6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Dog greeting Gaf");
    }
}
