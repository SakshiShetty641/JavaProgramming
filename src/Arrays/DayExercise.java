package Arrays;

public class DayExercise {
    public static void main(String[] args) {
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int length = days.length;
        System.out.println("Length is " +length);

        String dayOfWeek = "";
        for(String day : days){
            if(day.length() > dayOfWeek.length()){
                dayOfWeek = day;
            }
        }
        System.out.println("Day with most characters : " + dayOfWeek);

        for (String day : days) {
            System.out.println(day);
        }

        for (int i = days.length-1 ; i>=0; i-- ){
            System.out.println("Printing days in  opposite ");
            System.out.println(days[i]);
        }
    }
}
