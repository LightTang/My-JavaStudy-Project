package com.LightTang.Method;

import java.util.Scanner;

public class Demo003 {
    public static void main(String[] args) {
        System.out.println("Please input the first Num");
        Scanner sc_01 = new Scanner(System.in);
        int a = sc_01.nextInt();

        System.out.println("Please input the Second Num");
        Scanner sc_02 = new Scanner(System.in);
        int b = sc_02.nextInt();

        addMethod(a , b);
    }

    public static void addMethod(int a,int b) {
        int addResult = a + b;
        System.out.println("The Result is " + addResult);
    }
}
