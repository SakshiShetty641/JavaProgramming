package Arrays;

import java.util.ArrayList;

/*
If you need a data structure with a dynamic size that can increase or decrease as needed, you might consider using classes like ArrayList from the Java Collections Framework. ArrayList is a part of the java.util package and provides resizable arrays.
It internally manages the array size and allows elements to be added or removed dynamically.
 */
public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Remove an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1

        // Print elements of the ArrayList
        System.out.println("Elements of ArrayList: " + numbers);
    }
}
