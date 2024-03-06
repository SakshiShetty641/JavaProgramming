package Conditions;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        System.out.println("Choices available are");

        System.out.println("1 -Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.println("Enter a choice");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Result is " + (number1 + number2) );
        } else if (choice == 2) {
            System.out.println("Result is " + (number1 - number2));
        }
        else if (choice == 3) {
            System.out.println("Result is " + (number1 * number2));
        }
        else if (choice == 4) {
            System.out.println("Result is " + (number1 / number2));
        }


    }
}
