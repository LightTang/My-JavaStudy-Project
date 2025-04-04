package com.LightTang.Method;

public class Demo001 {
    public static void main(String[] args) {
         playGame();
    }

    public static void playGame() {
        System.out.println("111");
        System.out.println("222");
        Method_01();
        System.out.println("333");
        Method_02();
        System.out.println("444");
    }

    public static void Method_01() {
        System.out.println("001");

    }
    public static void Method_02(){
        Method_01();
        System.out.println("114514");
    }

}
