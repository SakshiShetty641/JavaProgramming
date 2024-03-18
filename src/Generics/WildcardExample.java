package Generics;

import java.util.List;

/*
Wildcard ? represents an unknown type.
It can be used as an argument type, a method return type, or a generic class type parameter.
 */

public class WildcardExample {

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<String> strings = List.of("Hello", "World");

        System.out.println("Printing integers:");
        printList(integers);

        System.out.println("Printing strings:");
        printList(strings);
    }
}
