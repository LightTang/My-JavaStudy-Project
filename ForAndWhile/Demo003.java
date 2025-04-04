package com.LightTang.ForAndWhile;

import java.util.Scanner;

public class Demo003 {
    public static void main(String[] args) {

        System.out.println("Please Input a Number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        boolean Num = true;

        for(int a = 2;a < i;a++){
            if(i % a == 0){
                System.out.println("不是质数");
                Num = false;
                break;
            } else if (Num=true) {
                System.out.println("是质数");
                break;
            }


        }
    }
}
