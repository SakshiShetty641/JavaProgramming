package Abstraction;

/*
Abstraction in Java is a fundamental concept in object-oriented programming (OOP) that focuses on hiding the implementation
details of a class and showing only the necessary features of an object to the outside world.
abstraction is a powerful concept in Java that enables you to create flexible, modular, and
reusable code by hiding implementation details and exposing only the necessary features of objects.
 */
abstract class Animals {
    private String name;

    public abstract void sound(); // Abstract method

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Dog extends Animals {
    @Override
    public void sound() {
        System.out.println("Sound is ");
    }


}

class Cat extends Animals {
    @Override
    public void sound() {
        System.out.println("Sound is ");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animals animal1 = new Dog();
        animal1.setName("Moti");
        animal1.sound();
        System.out.println("Name is " + animal1.getName());
        Animals animal2 = new Cat();
        animal2.setName("Cat");
        System.out.println("Name is " + animal2.getName());


    }
}
