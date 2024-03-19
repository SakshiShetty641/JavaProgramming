package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
-> Intermediate operations are operations that are executed on a stream before a terminal operation is applied.
-> These operations transform the elements of the stream, filter them, or create new streams from existing ones.
-> Terminal operations are operations that produce a result or a side-effect and mark the end of the stream.
 */

public class Example2 {

    /*
    .boxed(): This converts the IntStream to a Stream<Integer> by boxing each int into an Integer.
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1, n+1)
                .map(integer -> integer * integer * integer)
                .boxed()
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 5, 6, 6);
        numbers.stream().distinct().map(integer -> integer * integer).forEach(System.out::println);

        //Example1
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);
        integerList.stream()
                .map(integer -> integer * integer).
                forEach(integer -> System.out.println("Sum is " +integer));

        //Example2
        List<String> words = List.of("Apple", "Ant", "Bat");
        words.stream()
                .map(String::toLowerCase).
                forEach(word -> System.out.println("Words are " +word));

        //Example3
        List<String> wordsList = List.of("Apple", "Ant", "Bat");
        wordsList.stream()
                .map(String::length).
                forEach(word -> System.out.println("Word length is " +word));

        //Example4
        List<Integer> newNumbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> oddNumbers = newNumbers.stream()
                        .filter(integer -> integer % 2 !=0).toList();
        System.out.println("Odd Numbers are " +oddNumbers);

        System.out.println(getCubesOfFirstNNumbers(5));



    }
}
