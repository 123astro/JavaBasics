package com.careerdevs.introtorecursion;

public class Recursion {
    /*
    Recursion is a method that calls itself and always needs a way to break out of the loop of calling itself
    otherwise it will become an infinite loop.


     */

    public static void main(String[] args) {
        //countDown(1);

        // sum(10);
        System.out.println("");

        recursionSum(12);
        System.out.println(" ");
        countDownRecursive(10);

    }

    public static void countDown(int num) {

        for (int i = num; i >= 0; i--)
            System.out.println(i);
    }

    public static int countDownRecursive(int num) {
        if (num < 0) {
            return -1;
        }
        System.out.println(num);
        countDownRecursive(num - 1);
        return  -1;
    }


    public static int sum(int n) {
        int num = 0;
        for (int i = 1; i < n + 1; i++) {
            num = i + num;
            System.out.println(num);
        }
        return num;
    }


//    public static int recursionSum2(int num){
//        if(num !=  ){
//            return num = i + num;
//        }
//    }

    public static int recursionSum(int n) {
        if (n < 0) {  // out of the recursion loop
            return -1;
        }
        if (n > 0) {
            int sum = n * ( n + 1) / 2;
            System.out.println(sum);
            recursionSum(n - 1);
        }
            return 0;
    }
}
