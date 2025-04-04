package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo004 {
    public static void main(String[] args) {
        int a = point_Cau();
        System.out.println(a);
    }

    public static int point_Cau() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ple input the num");
            /*
            int a = userInput();
            a = arr[i];  这里是之前的错误写法
             */
            arr[i] = userInput();
        }

        int max = arr[0];
        int min = arr[1];

        //通过for循环找出最值
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > max) {
                //arr[0] = arr[i];
                max = arr[i];
            } else {
                i++;
            }
        }
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] < min) {
                //arr[0] = arr[i];
                min = arr[i];
            } else {
                i++;
            }
        }
        //计算总分
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            count += arr[j];
        }
        int Result =(count - min - max) / 4;
        return Result;
    }
    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
