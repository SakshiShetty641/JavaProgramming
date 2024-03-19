package FunctionalProgramming;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        {

        integerList.stream().filter(integer -> integer % 2 == 0).forEach(integer ->
            System.out.println("Even integers " +integer));
        }

        {

            integerList.stream().filter(integer -> integer % 2 != 0).forEach(integer ->
                    System.out.println("Odd integers " +integer));


        }
        {

            int sum =  integerList.stream()
                    .filter(integer -> integer % 2 != 0)
                    .reduce(0, (Integer::sum));
            System.out.println(sum);
        }
    }
}
