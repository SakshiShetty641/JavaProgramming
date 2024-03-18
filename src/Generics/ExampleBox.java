package Generics;

public class ExampleBox <T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }


    public static void main(String[] args) {
        ExampleBox<Integer> integerBox = new ExampleBox<>();
        integerBox.setItem(10);
        System.out.println("Item in integerBox: " + integerBox.getItem());

        ExampleBox<String> stringBox = new ExampleBox<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println("Item in stringBox: " + stringBox.getItem());
    }
}



/*
-> When creating instances of Box, you specify the actual type that T represents. For example, Box<Integer> and Box<String>.
-> This allows you to create boxes that can hold different types of items, while still enforcing type safety at compile time.

 */
