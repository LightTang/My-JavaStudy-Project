package com.LightTang.Method;

import java.util.Scanner;

public class Demo004 {
    public static void main(String[] args) {
        System.out.println("Please input the longer side");
        Scanner sc_01 = new Scanner(System.in);
        int a = sc_01.nextInt();

        System.out.println("Please input the short side");
        Scanner sc_02 = new Scanner(System.in);
        int b = sc_02.nextInt();

        spareC(a , b);

    }

    public static void spareC(int a ,int b) {
        int C =a * 2 + b * 2;
        System.out.println(C);

    }
}
