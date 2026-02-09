package com.lambdaExpression;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.greet();
        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }

            @Override
            public void Namaste() {

            }
        };
        g.greet();g.Namaste();

    }
}
