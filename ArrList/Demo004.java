package com.LightTang.ArrList;

public class Demo004 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] / 2);
            } else if (arr[i] % 2 == 1) {
                System.out.println(arr[i] * 2);
            }
        }
    }
}
//将数组内的数字 奇数*2 偶数/2 并输出