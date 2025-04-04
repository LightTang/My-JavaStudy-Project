package com.LightTang.compreExercise;

import java.util.Scanner;

public class Demo001 {
    public static void main(String[] args) {
        System.out.println("please input ur fee of ticket");
        double userTicketFee = userInput();
        System.out.println("pls input the month");
        int userTicketMonth = userInput_M();
        System.out.println("input the type");
        String userTicketType = userInput_T();

        double disRes = discCon(userTicketType , userTicketMonth);
        double Result = userTicketFee * disRes;
        if(Result > 0){
            System.out.println("you fee is" + Result);
        } else {
            System.out.println("The data you input exist error(s),pls check");
        }

    }
    //get ticket fee
    public static double userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static int userInput_() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //input ticket type
    public static String userInput_T() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    //input month
    public static int userInput_M() {
        int i = userInput_();
        if(i >= 1 && i <= 12){
            Scanner sc = new Scanner(System.in);
            return i;
        }else{
            return 13;
        }
    }

    public static double discCon(String i,int a) {
        switch (i){
            case "头等舱" :
                if(a >= 5 && a <=10){
                    return 0.9;
                } else if (a >=11 && a <= 12 || a >=1 && a <=4) {
                    return 0.7;
                }
            case "经济舱" :
                if(a >= 5 && a <=10){
                    return 0.85;
                } else if (a >=11 && a <= 12 || a >=1 && a <=4) {
                    return 0.65;
                }
            default:
                return 0;
        }
    }


}
//