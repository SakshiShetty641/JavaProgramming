package Arrays;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;

/*
Exercise 1
 */
public class Student {

    String name;
    int [] marks;

    public Student(String name, int [] marks) {
        this.name = name;
        this.marks = marks;

    }

    public static void main(String[] args) {
        int [] marks = {90, 80, 60};
        Student student = new Student("Sakshi", marks);
        int number = student.getNumberOfMarks();
        System.out.println("Number of marks is : " +number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Total sum is :" +sum);
        int maxMark = student.getMaxMark();
        System.out.println("Max is :" +maxMark);
        int minMark = student.getMinMark();
        System.out.println("Min is :" +minMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average is :" +average);
    }

    private BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return  new BigDecimal( sum/number);
    }

    private int getMinMark() {
        int min = Integer.MAX_VALUE;
        for (int mark : marks){
            if(mark <= min){
                min = mark;
            }
        }
        return min;
    }

    private int getMaxMark() {
        int max = Integer.MIN_VALUE;
        for (int mark : marks){
           if(mark > max){
               max = mark;
           }
        }
        return max;
    }

    private int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : marks){
            sum = sum + mark;
        }
        return  sum;
    }

    private int getNumberOfMarks() {
        return marks.length;
    }

}
