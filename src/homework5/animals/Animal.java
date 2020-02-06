package homework5.animals;

/**
 * 5.1 Create abstract class Animal which has one private field nam of type String and abstract method greeting();
 *                            Create one constructor with name parameter
 *                            Create subclass of Animal with name Cat
 *                            Create subclass of Animal with name Dog
 *                            Crete subclass of Dog with name Akita
 *                            Override greeting() method in all subclasses
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String greeting();
}
