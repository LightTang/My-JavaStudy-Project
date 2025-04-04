package com.LightTang.ArrList;

import java.util.Random;

public class Demo006 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10];
        System.out.println("-----下面为随机生成的数-----");
        for (int i = 0; i < arr.length; i++) {
            int r_1 = r.nextInt(100) + 1; //定义随机数范围在1-100
            arr[i] = r_1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //sum
        int sum = 0; //更正后代码
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("这些数的和是" + sum);


        //average
        int avg = sum / arr.length;
        System.out.println("平均数是" + avg);


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("有" + count + "个数字比平均数小");
    }
}
