package com.LightTang.ForAndWhile;

import java.util.Random;
import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1; //定义随机数范围在1-100

        Scanner sc = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100");

        while (true){
            int User_Input = sc.nextInt();
            if(User_Input == i){
                System.out.println("You Win");
            } else if (User_Input > i) {
                System.out.println("It's Big");
            } else if (User_Input < i){
                System.out.println("It's Small");
            }
        }
    }
}