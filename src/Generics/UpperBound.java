package Generics;


/*
An upper bound wildcard is denoted by the ? extends syntax.
It specifies that a type parameter must be a subtype of the specified upper bound.
 */
import java.util.List;

public class UpperBound {
    public static double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.5, 2.5, 3.5, 4.5, 5.5);

        System.out.println("Sum of integers: " + sum(integers));
        System.out.println("Sum of doubles: " + sum(doubles));
    }
}
