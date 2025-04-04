package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {
getUserInput();
    }

    public static int getUserInput() {

        int[] arr={2,6,8,6};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0,j = arr.length - 1;i < j; i++, j --) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
             num = num * 10 +arr[i];
        }
        System.out.println(num);
        return num;

    }
}
//2024 0124 0854 pm