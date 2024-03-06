package Conditions;
/*
switch (variable) {
    case value1:
        // code to be executed if variable equals value1
        break;
    case value2:
        // code to be executed if variable equals value2
        break;
    // more cases can be added as needed
    default:
        // code to be executed if variable doesn't match any case
}

 */
import java.util.Scanner;

public class SwitchStatements {
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

        switch (choice){
            case 1:
                System.out.println("Result is " + (number1 + number2) );
                break;
            case 2:
                System.out.println("Result is " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result is " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
