package DataTypes;


/*
Primitive data types represent basic types of data, and they are predefined by the language itself.
 They are built into the Java language and are not objects. They are used to define variables that will hold primitive values.
Java has eight primitive data types:
byte: 8-bit integer , short: 16-bit integer, int: 32-bit integer, long: 64-bit integer, float: 32-bit floating point, double: 64-bit floating point, char: 16-bit Unicode character
boolean: true or false

Non-primitive data types are also called reference types because they refer to objects.
They are not predefined by Java but are created by the programmer. Non-primitive data types are used to store complex data types such as Strings, Arrays, and Objects.
Non-primitive data types include:

Classes, Interfaces, Arrays, Strings, Enums
*/
public class DataType {

    public static void main(String[] args) {
        int i = 5;
        int result = i++;
        System.out.println("Result: " + result);
        System.out.println("Value of i: " + i);

        int j = 5;
        int ans = ++i; // j is incremented to 6, then result is assigned 6
        System.out.println("Result: " + ans);
        System.out.println("Value of i: " + j);

        float floatValue = 3.14f;
        System.out.println("Float" +floatValue);

    }


}
