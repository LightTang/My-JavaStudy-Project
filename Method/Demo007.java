package com.LightTang.Method;

import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {

    }

    public static byte Compare(byte a, byte b) {
        byte max;
        if (a > b){
            max = a;
        }else if (a < b) {
            max = b;
        } else{
            max = a;
        }
        return max;
    }
    public static short Compare(short a,short b){
        short max;
        if (a > b){
            max = a;
        }else if (a < b) {
            max = b;
        } else{
            max = a;
        }
        return max;
    }
    public static int Compare(int a,int b){
        int max;
        if (a > b){
            max = a;
        }else if (a < b) {
            max = b;
        } else{
            max = a;
        }
        return max;
    }
    public static long Compare(long a,long b){
        long max;
        if (a > b){
            max = a;
        }else if (a < b) {
            max = b;
        } else{
            max = a;
        }
        return max;
    }
    public static void userInput(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }

}
