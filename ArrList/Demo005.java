package com.LightTang.ArrList;

public class Demo005 {
    public static void main(String[] args) {

        int[] arr = {343,534,252,443,525};

        int max = arr[0]; //临时认为第0索引的数是最大的
        for(int i = 1;i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);//输出最大值
    }
}
