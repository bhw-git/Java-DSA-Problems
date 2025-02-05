package Practice;

import java.util.Arrays;

public enum DaysofWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class Week{
    public static void main(String[] args) {
        DaysofWeek days = DaysofWeek.FRIDAY;
        if(days == DaysofWeek.FRIDAY){
            System.out.println("Its friday");
        }
        System.out.println(Arrays.toString(DaysofWeek.values()));
    }
}
