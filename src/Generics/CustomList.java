package Generics;

/*
allow you to define classes and methods with placeholders for data types, enabling you to write more flexible and reusable code.
 */

import java.util.ArrayList;

public class CustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }

    public T getIndex(int index){
        return list.get(index);
    }

    public static void main(String[] args) {
        CustomList<String> customList = new CustomList<>();
        customList.addElement("String 1");
        customList.addElement("String 2");
        System.out.println(customList);
        String value = customList.getIndex(0);
        System.out.println(value);

        CustomList<Integer> customListWithNumber = new CustomList<>();
        customListWithNumber.addElement(10);
        customListWithNumber.addElement(12);
        System.out.println(customListWithNumber);
        String number = customList.getIndex(0);
        System.out.println(number);

    }
}
