package Generics;

/*
A lower bound wildcard is denoted by the ? super syntax. It specifies that a type parameter must be a supertype of the specified lower bound.
This allows you to accept any type that is a supertype of a particular class.
 */

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void addSuperClass(List<? super Integer> list, Integer value) {
        list.add(value);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addSuperClass(numbers, 10); // Adding Integer to a list of Number
        System.out.println("Numbers: " + numbers);

        List<Object> objects = new ArrayList<>();
        addSuperClass(objects, 20); // Adding Integer to a list of Object
        System.out.println("Objects: " + objects);
    }
}
