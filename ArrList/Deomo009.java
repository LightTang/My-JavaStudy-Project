package com.LightTang.ArrList;

import java.util.Random;

public class Deomo009 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int RaIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[RaIndex];
            arr[RaIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
