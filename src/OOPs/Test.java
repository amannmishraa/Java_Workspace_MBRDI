package OOPs;

// Base class
class Liquid {
    public void swirl() {
        System.out.println("Swirling the liquid");
    }
}

// Subclasses
class Coffee extends Liquid {
    @Override
    public void swirl() {
        System.out.println("Swirling coffee");
    }
}

class Tea extends Liquid {
    @Override
    public void swirl() {
        System.out.println("Swirling tea");
    }
}

class Juice extends Liquid {
    @Override
    public void swirl() {
        System.out.println("Swirling juice");
    }
}

// Mug class
class Mug {
    void addLiquid(Liquid l) {
        l.swirl(); // polymorphism in action
    }
}

// Main class (ONLY public class)
public class Test {
    public static void main(String[] args) {

        Liquid l = new Liquid();
        Coffee c = new Coffee();
        Tea t = new Tea();
        Juice j = new Juice();

        Mug m = new Mug();

        m.addLiquid(l);
        m.addLiquid(c);
        m.addLiquid(t);
        m.addLiquid(j);

        // Array of Liquids (polymorphism)
        Liquid[] list = new Liquid[3];
        list[0] = l;
        list[1] = c;
        list[2] = t;
    }
}
