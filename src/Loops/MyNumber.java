package Loops;

/*
for Loop:
The for loop is used when you know in advance how many times you want to execute a block of code.
It consists of three parts: initialization, condition, and iteration.
 */

public class MyNumber {

    private final int number;

    public MyNumber(int myNumber) {
        this.number = myNumber;
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(6);
        boolean isPrime = myNumber.isPrime();
        System.out.println(isPrime);
        int sum = myNumber.sumUpToN();
        System.out.println(sum);
        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println(sumOfDivisors);
        myNumber.printNoTriangle();
    }

    private int sumOfDivisors() {
        int sum = 0;
        for(int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private int sumUpToN() {
        int sum = 0;
        for(int i = 0; i <= number; i++){
           sum = sum + i;
        }
        return sum;
    }

    private boolean isPrime() {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                System.out.println("Number is not Prime");
                return false;
            }
        }
        System.out.println("Number is prime");
        return true;
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */

    private void printNoTriangle(){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
