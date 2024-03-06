package Conditions;


public class SwitchExercise2 {

    public static String determineNameOfDay(int dayNumber){
        String result = "";
        switch (dayNumber){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            default:
                System.out.println("Invalid day");
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(determineNameOfDay(5));


    }
}
