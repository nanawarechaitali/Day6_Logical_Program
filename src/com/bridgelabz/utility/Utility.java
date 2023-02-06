package com.bridgelabz.utility;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Utility {
    public static boolean isPowerOfTwo;
    static Scanner sc =new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);

    public Utility(InputStream in) {
    }

    public Utility() {

    }


    public static boolean isAnagramsStings(String str1, String str2) {
        boolean isAnagram = true;


            char arr1[] = str1.toLowerCase().toCharArray();
            char arr2[] = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (arr1.length != arr2.length) {
                return false;

            } else {
                for(int i =0;i< arr1.length;i++){
                    if(arr1[i] == arr2[i]) {
                        isAnagram = true;
                    }else{
                        isAnagram=false;
                        break;
                    }
            }

        }
        return isAnagram;


    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> isPrimePalindrom(ArrayList<Integer> alist) {
        ArrayList<Integer> blist = new ArrayList<>();
        for (int i = 0; i < alist.size(); i++) {
            int a = alist.get(i);
            int reverse = 0;
            while (a > 0) {
                int r = a % 10;
            }
            if (reverse == alist.get(i)) {
                blist.add(reverse);

            }
        }
        return blist;


    }

    public static void main(String[] args) {

    }

    public static int inPutInt() {
        return 0;
    }

    public static int dayOfWeek(int m, int y) {


        return 0;

    }




    public int inputInteger() {


        return 0;
    }
    public static void tempConvert(int choice, int temperature){
        int convert;
        switch(choice){
            case 1:
                convert =(temperature*9/5)+32;
                System.out.println("After conversion:"+convert);
                break;

            case 2:
                convert = (temperature-32)*5/9;
                System.out.println("After conversion: " + convert);
                break;

            default:
                break;
        }
    }
    public static float monthlyPayment(float payment,float rate,float year){
        float monthlyPay =0.0f;
        int months= (int)(12*year);
        float r =rate*((float)rate/12*100);
        monthlyPay=(float)((payment*r)/(1-Math.pow(1 + r,-months)));
        return monthlyPay;
    }
    public static void writeFile(String word[], String filePath) {

        try {
            FileWriter writer = new FileWriter(filePath, false);
            PrintWriter out = new PrintWriter(writer);
            for (int i = 0; i < word.length; i++) {
                out.write(word[i] + " ");
            }
            out.close();
            writer.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static double sqrt(){
        double epslion = 1e-15;
        double number = 0;
        double t = number;


        while(Math.abs(t - number /t)>epslion*t){
            t = (number / t+ t) /2;


        }
        return t;
    }
    public static String toBinary(int number){
        int rem;
        String bin[] = {"0","1"};
        String binary = " ";
        int padding = 0;
        while(number  >0 || padding % 8 !=0){
            rem = number %2;
            binary = bin[rem] + binary;
            number = number/2;
            padding++;
            if(padding % 4 == 0  && number !=0){
                binary = " " +binary;
            }
        }
        return binary;
    }
    public static String swappedNibbles(String binary){
        binary = binary.replaceAll(" ","");
        String lowerNibble=binary.substring(0,4);
        String upperNibble=binary.substring(4,8);
        String swappedBinary = upperNibble + lowerNibble;
        return swappedBinary;

    }
    public static int binaryToDecimal(String binary){
        int decimal =0, power=0;
        binary=binary.replaceAll(" ","");
        int index=binary.indexOf() -1;
        while(index>=0){
            decimal=(int)(Integer.parseInt(binary.charAt(index)+"")*Math.pow(2,power));
            power++;
            index--;
        }
        return decimal;

    }
    public static boolean isPowerOfTwo(int number){
        int power = 0;
        int division = number;
        while(division>1){
            division = division/2;
            power++;

        }
        return number == (int)Math.pow(2,power);
    }




}
