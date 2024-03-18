package AnonymousClass;
/*
an anonymous class is a class without a name.
It's typically used for creating a one-time-use class that is needed only at a particular point in your code.
 */

interface Greeting {
    void greet();
}
public class Example {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, world!");
            }
        };

        // Calling the method of the anonymous class
        greeting.greet();
    }
}
