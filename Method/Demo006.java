package com.LightTang.Method;

import java.util.Scanner;

public class Demo006 {
    public static void main(String[] args) {
        System.out.println("please int put the length of the first square");
        double l1 = inputInfo();
        System.out.println("please int put the length of the first square");
        double w1 = inputInfo();
        double Rs1 = squareS(l1 , w1);

        System.out.println("please int put the length of the second square");
        double l2 = inputInfo();
        System.out.println("please int put the length of the second square");
        double w2 = inputInfo();
        double Rs2 = squareS(l2 , w2);

        if(Rs1 > Rs2){
            System.out.println("The first is bigger");
        }else if(Rs1 < Rs2){
            System.out.println("The Second is bigger");
        }


    }

    public static double squareS(double a ,double b) {
        double s = a * b;
        return s;
    }

    public static double inputInfo() {
        Scanner sc =new Scanner(System.in);
        double l = sc.nextDouble();
        return l;
    }
    /*
    public static double inputInfo_02() {
        Scanner sc =new Scanner(System.in);
        double w = sc.nextDouble();
        return w;
        }
     */

}
