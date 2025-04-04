package com.LightTang.ArrList;

public class Demo003 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int count = 0;

        for(int i = 0;arr.length > i;i++){
            if(arr[i] % 3 == 0){
                count++;
            }
            //System.out.println(count);
        }
        System.out.println(count);
    }
}

