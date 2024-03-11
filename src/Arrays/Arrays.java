package Arrays;

/*

In Java, an array is a data structure that allows you to store multiple values of the same type under a single variable name.
Arrays can hold primitive data types (such as int, char, etc.) as well as object references.
 */
public class Arrays {
    public static void main(String[] args) {

        int [] numbers = new int[5];


        int [] marks = {10, 20, 30, 40, 50, 60, 70, 80};
        for(int i = 0; i < marks.length; i++){
            System.out.println("Elements are : " +marks[i]);

        }
        // Enhanced For Loop
        for (int mark : marks) {
            System.out.println("Elements are : " + mark);

        }
    }

}
