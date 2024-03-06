package Conditions;
/*
condition ? expression1 : expression2
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int max = (x > y) ? x : y;
        System.out.println("The maximum value is: " + max);
    }
}
