package com.LightTang.ForAndWhile;

import java.util.Scanner;

public class Demo002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a Number");
        int i = sc.nextInt();


        System.out.println("Please Input 1 or 2");


        Scanner scc = new Scanner(System.in);
        int z = scc.nextInt();
        switch (z){ //just for choosing methods
            case 1 :
                for (int a = 1;a <= i; a++) {
                    if (a * a == i){
                        System.out.println(a);
                        break;
                    } else if (a * a > i) {
                        System.out.println(a - 1);
                        break;
                    }
                }
                break;
            case 2 :
                int a = 1;
                while(a <= i){
                    if(a * a == i){
                        System.out.println(a);
                        break;
                    }else if(a * a > i){
                        System.out.println(a-1);
                        break;
                    }
                    a++;
                }
            default:
                break;
        }
    }
}
//用for和while计算平方根