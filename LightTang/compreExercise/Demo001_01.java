package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo001_01 {
    public static void main(String[] args) {
        //getPrice();
    }

    public static double getPrice(int Price,String type,int Month) {
        System.out.println("pls type in the price");
        int price = userInput();

        Scanner sc = new Scanner(System.in);
        System.out.println("pls type in the price");
        String tyoe = sc.next();


        int discount = 0;
        if(Month >= 5 && Month <= 10){
            discount = 1;
        }else if (Month >=11 && Month <= 12 || Month >=1 && Month <=4){
            discount = 2;
        }else {
            System.out.println("The Month You Input is Wrong");
        }

        switch (type){
            case "头等舱" :
            if(discount == 1){
                return price * 0.9;
            } else if (discount == 2) {
                return price * 0.7;
            }
            case "经济舱" :
                if(discount == 1){
                    return price * 0.85;
                } else if (discount == 2) {
                    return price * 0.65;
                }
            default:
                System.out.println("wrong");
                return 0;

        }

    }

    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
//已作废