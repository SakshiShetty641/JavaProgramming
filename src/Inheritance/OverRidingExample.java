package Inheritance;
/*
Method overriding in Java allows a subclass to provide a specific implementation of a method that is already provided by one of its superclasses.
 */

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method of the Animal class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    // Overriding the sound() method of the Animal class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class OverRidingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Output: Animal makes a sound
        myDog.sound();    // Output: Dog barks
        myCat.sound();    // Output: Cat meows
    }
}
