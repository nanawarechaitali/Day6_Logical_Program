package com.bridgelabz;

public class Util {
    public int calcualeDayOfWeek(int day, int month, int year){
        int y0 , x,m0, d0;
        y0 =year -(14 - month)/12;
        x = y0+y0/4-y0/100+y0/400;
        m0 =month + 12 * ((14 - month)/12) -2;
        d0 = (day + x +31 *m0/12)%7;
        return d0;
    }
}
