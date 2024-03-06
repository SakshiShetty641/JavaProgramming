package Constructors;

/*
In Java, a constructor is a special type of method that is invoked when an object of a class is created.
It initializes the newly created object. The constructor method has the same name as the class and does not have a return type, not even void.

->Name: Constructors have the same name as the class they belong to.
->No Return Type: Constructors do not have a return type, not even void.
->Initialization: Constructors are primarily used to initialize the state of an object when it is created.
->Overloading: Like methods, constructors can be overloaded, which means a class can have multiple constructors with different parameters.
->Implicit Default Constructor: If you do not define any constructors in a class, Java provides a default constructor implicitly. This default constructor initializes instance variables to their default values (0 for numeric types, null for objects, false for boolean, etc.).


 */
public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Default constructor (no parameters)
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        System.out.println("Details are " +car.make);
        Car defaultCar = new Car(); // Invokes the second constructor

    }
}
