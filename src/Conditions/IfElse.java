package Conditions;

import java.util.Scanner;

/*
if (condition) {
    // block of code to be executed if the condition is true
} else {
    // block of code to be executed if the condition is false
}
 */
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number " );
        int number = sc.nextInt();
        if(number == 25){
            System.out.println("Number is 25");
        } else if (number == 24) {
            System.out.println("Number is 24");
        }
        else
            System.out.println("Number is neither 25 nor 24");
    }
}
