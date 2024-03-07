package Loops;
/*
do-while Loop:
The do-while loop is similar to the while loop, but the condition is checked after the execution of the loop block.
This guarantees that the loop block executes at least once.
java

 */
public class DoWhile {
    public static void main(String[] args) {
        int i = 3;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 5);
    }
}
