package com.careerdevs.introtorecursion;

public class Recursion {
    /*
    Recursion is a method that calls itself and always needs a way to break out of the loop of calling itself
    otherwise it will become an infinite loop.


     */

    public static void main(String[] args) {
        countDown(10);
    }

    public static void countDown(int num){

     for(int i = num; i >=0; i--)
           System.out.println(i);
       }
    }


