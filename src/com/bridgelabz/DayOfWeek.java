package com.bridgelabz;
import com.bridgelabz.utility.Utility;

public class DayOfWeek {


        public static void main(String[] args) {
            new Utility();
            System.out.println("Enter the date [M-D-Y]");
            System.out.println("Month:");
            int m = Utility.inPutInt();
            System.out.println("Date:");
            int d = Utility.inPutInt();
            System.out.println("Year:");
            int y = Utility.inPutInt();
            int day = Utility.dayOfWeek( m,y);
            System.out.println(day);


    }
}
