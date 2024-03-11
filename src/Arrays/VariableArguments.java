package Arrays;
/*
Variable arguments, also known as varargs, allow you to pass a variable number of arguments to a method in Java.
varargs are specified by using an ellipsis (...) after the parameter type in the method declaration
Varargs must be the last parameter in the method's parameter list.
A method can have only one varargs parameter.
 */
public class VariableArguments {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50);
    }

    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
