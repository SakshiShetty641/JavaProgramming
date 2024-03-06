package Encapsulation;

/*
 It refers to the bundling of data (attributes) and methods (functions) that operate on the data into a single unit, called a class.
 The data is hidden from the outside world and can only be accessed through the methods defined in the class.
 This concept helps to ensure data integrity and protects the internal state of an object from external interference.
 In Java, you can provide public methods, also known as accessor (getter) and mutator (setter) methods, to access and modify the private data members of a class, respectively.
 This allows controlled access to the data.

 -> This keyword
 * this is a reference to the current object within an instance method or a constructor.
 * When there's a local variable with the same name as an instance variable, this keyword can be used to differentiate between them. I
 */

public class EncapsulationExample {

    private int number; // private field

    // public method to set the value of the private field
    public void setNumber(int number) {
        System.out.println("Number is " + number);
        System.out.println("This . Number is " + this.number);
        this.number = number;
    }

    public void increaseNumber(int increasedNo) {
        this.number = number + increasedNo;

    }

    // public method to get the value of the private field
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        EncapsulationExample example = new EncapsulationExample();

        // Set the value of the private field using the setter method
        example.setNumber(10);
        System.out.println("Value before increasing : " + example.getNumber());

        example.increaseNumber(20);
        System.out.println("Value after increasing : " + example.getNumber());
    }

}
