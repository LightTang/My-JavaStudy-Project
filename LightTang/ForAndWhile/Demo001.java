package com.LightTang.ForAndWhile;

public class Demo001 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0 || i % 10 ==7){
                System.out.println(i);
                continue;
            }else{
                System.out.println("pass");
            }
        }
    }
}
//逢7过