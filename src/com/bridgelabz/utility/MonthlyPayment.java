package com.bridgelabz.utility;

public class MonthlyPayment {
    public static void main(String[] args) {
        float payment = Float.parseFloat(args[0]);
        float rate = Float.parseFloat(args[1]);
        float year = Float.parseFloat(args[2]);
        System.out.println(Utility.monthlyPayment(payment,rate,year));
    }

}
