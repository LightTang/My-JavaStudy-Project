package com.LightTang.Method;

public class Demo008 {
    public static void main(String[] args) {
        int[] arr ={11,22,33,44,55};
        arrPrint(arr);
    }

    public static void arrPrint(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                System.out.print(arr[i] + ",");
            }else {
                System.out.print(arr[i]);
            }

        }
        System.out.print("]");
    }


}
