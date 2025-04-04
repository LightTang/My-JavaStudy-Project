package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo002 {
    public static void main(String[] args) {
        //int i = 100;
        int count = 0;
        for (int i = 100; i < 200; i++) {
            boolean flag = true;
            System.out.print(i + " ");
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    count++;
                    break;
                }
            }
            if(flag){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            //System.out.println("++++++++++");
            System.out.println(count);
        }

/*
        for (int j = 2; j < 100; j++) {
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

 */
    }
}
//2024 0124 0854 pm