package com.LightTang.Method;

public class Demo009 {
    public static void main(String[] args) {
        int[] arr={324,567,156,432,645};
        int a = maxFind(arr);
        System.out.println(a);
    }

    public static int maxFind(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
