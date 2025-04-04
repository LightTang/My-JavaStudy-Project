package com.LightTang.Method;

import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {
        System.out.println("please input a Num");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double q = circleC(a);
        System.out.println(q);
        System.out.println(circleS(a));
    }
    public static double circleS(double r){
        double p = 3.14;
        double s = p * r * r;
        return s;
        //System.out.println(s);
    }

    public static double circleC(double r) {
        double p = 3.14;
        double c = 2 * r * p;
        return c;
        //System.out.println(c);
    }
}
