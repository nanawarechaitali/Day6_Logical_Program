package com.bridgelabz;
import com.bridgelabz.utility.Utility;

import java.sql.SQLOutput;

public class Stopwatch {
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    //to start timer
    public void start(){
        startTimer=System.currentTimeMillis();
        System.out.println("Sart time is : " +startTimer);
    }

    //to stop timer
    public void stop(){
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop time is: "+stopTimer);
    }
    public long getElapsedTime(){
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        Utility u = new Utility();
        System.out.println("Press '1' to Start Time: ");
        u.inputInteger();
        sw.start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");
        u.inputInteger();
        sw.stop();


        long l = sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is :" +l);
        System.out.println();
        System.out.println("Converting millisec to seconds: "+(1/1000)+"sec");
    }






}
