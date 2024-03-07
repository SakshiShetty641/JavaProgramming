package Loops;

public class LoopExercise1 {
    private int limit;

    public LoopExercise1(int limit) {
        this.limit = limit;
    }

    public static void main(String[] args) {
        LoopExercise1 loopExercise = new LoopExercise1(10);
        loopExercise.printSquaresUpToLimit();
        loopExercise.printCubesUpToLimit();

    }

    private void printSquaresUpToLimit() {
        int i = 1;
        while (i * i < 30) {
            System.out.println(i * i);
            i++;
        }
    }

    private void printCubesUpToLimit() {
        int i = 1;
        while (i * i * i < 30) {
            System.out.println(i * i);
            i++;
        }
    }
}
