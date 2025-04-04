package com.LightTang.ArrList;

public class Demo005_01 {
    public static void main(String[] args) {

        int[] arr ={234,546,542,654,127};
        int min =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[0] > min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
