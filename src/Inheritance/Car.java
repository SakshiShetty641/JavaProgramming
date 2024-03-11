package Inheritance;
/*
 Inheritance is a fundamental concept that allows one class (subclass or child class) to inherit properties and behaviors
 (methods) from another class (superclass or parent class).
 This enables code reuse and promotes the principle of hierarchical classification.

 ->A subclass can only inherit from one superclass, i.e., Java supports single inheritance.
-> A subclass can override methods inherited from its superclass to provide its own implementation. This is known as method overriding.
-> In Java, all classes are descendants of the Object class, either directly or indirectly.
So, every class inherits methods from the Object class.

 */

// Parent class
class Vehicle {
    String brand;
    int year;

    void drive() {
        System.out.println("The vehicle is moving.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int numberOfSeats;

    void honk() {
        System.out.println("Beep beep!");
    }


    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();

        // Access fields inherited from the Vehicle class
        myCar.brand = "Toyota";
        myCar.year = 2022;

        // Access fields specific to the Car class
        myCar.numberOfSeats = 5;

        // Call methods inherited from the Vehicle class
        myCar.drive();

        // Call methods specific to the Car class
        myCar.honk();
    }
}