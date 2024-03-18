package Generics;

/*
The printArray method is declared with a type parameter <T>. This indicates that it's a generic method with a single type parameter T.
The method can accept an array of any type (T[]) and prints its elements.
The main method demonstrates how to call the printArray method with arrays of different types (Integer, Double, Character).
 */

public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("Character Array:");
        printArray(charArray);
    }
}
