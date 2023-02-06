package com.bridgelabz.utility;

public class TemperatureConversion {
    private static Utility utility;

    public static void main(String[] args) {
        new Utility();
        
        
        System.out.println("make a choice:");
        System.out.println("Choose 1: Celsius to Fahrenit\n choose 2: Fahrenit to Celsius");


        int choice = utility.inPutInt();
        System.out.println("Enter the temperature:");
        int temperature = Utility.inPutInt();
        Utility.tempConvert(choice,temperature);
        
    }
}
