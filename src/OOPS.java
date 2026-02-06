// Abstraction: abstract class
abstract class Animal {
    // Encapsulation: private variable
    private String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Getter (encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (abstraction)
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Inheritance
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Polymorphism: method overriding
    @Override
    void sound() {
        System.out.println(getName() + " says: Bark");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // Polymorphism
    @Override
    void sound() {
        System.out.println(getName() + " says: Meow");
    }
}

// Main class
public class OOPS{

    public static void main(String[] args) {

        // Object creation
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");

        // Runtime polymorphism
        dog.sound();
        dog.eat();

        cat.sound();
        cat.eat();
    }
}
