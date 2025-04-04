package com.LightTang.Method;

public class Demo011 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
    }

    public static int[] copyOfRange(int[] arr,int from,int to) {
        int a = 0;
        int[] newarr =new int[to - from];
        for (int i = 0; i< to; i++) {
            newarr[a] =arr[i];
            a++;
        }
        return newarr;
    }
}
