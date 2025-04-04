package com.LightTang.ForAndWhile;
import java.util.Random;


public class Demo004 {
    public static void main(String[] args) {

        for(int a=1;a<=100;a++){
            Random r = new Random();
            int i =r.nextInt(100)+1;
            System.out.println(i );
        }
    }
}
