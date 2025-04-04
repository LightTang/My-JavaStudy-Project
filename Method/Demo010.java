package com.LightTang.Method;

import java.util.Scanner;

public class Demo010 {
    public static void main(String[] args) {
        int[] arr ={234,135,346,124,451,324,451,457,256};
        System.out.println("1");
        //numSer(arr);
        boolean isPresent = numSer(arr);
        System.out.println("数字是否在数组中：" + isPresent);
    }

    public static boolean numSer(int[] arr) {
        int a =userInputInfo();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
                return true;
            }
        }
                return false;
    }

    public static int userInputInfo() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
