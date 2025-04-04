package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo004_01 {
    public static void main(String[] args) {
        int i = output();
        System.out.println(i);
    }

    public static int[] userInput() {
        int[] arr = new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("pls input num");
            int n = sc.nextInt();
            if(n >= 0 && n <=100){
                arr[i] = n;
            }else {
                System.out.println("error");
            }
        }
        return arr;
    }

    public static int getMax(int arr[]) {
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int arr[]) {
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int Count(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    public static int output() {
        int[] arr =userInput();
        int max = getMax(arr);
        int min = getMin(arr);
        int count = Count(arr);
        int result_Score = (count - max - min) / 4;
        return result_Score;
    }


//评委打分
}
