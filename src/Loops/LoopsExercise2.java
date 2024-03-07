package Loops;

import java.util.Scanner;

public class LoopsExercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        do{
            if(num != -1) {
                System.out.println("Cubes is " + (num * num * num));
            }
            System.out.println("Enter a number");
            num = sc.nextInt();

        }while (num >=0);
        System.out.println("Thank you");


    }


}
