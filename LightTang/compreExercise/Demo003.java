package com.LightTang.compreExercise;

import java.util.Random;

public class Demo003 {
    public static void main(String[] args) {

        char[] chs=new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i <=25){
                chs[i] = (char)(97 + i);
            }else {
                chs[i] = (char) (65 + i -26);
            }
        }
        String result ="";
        Random R = new Random();
        int N =R.nextInt(9);
        for(int i = 0;i < 4;i++){
            int R_Index = R.nextInt(chs.length);
            result = result + chs[R_Index];
            //System.out.print(chs[R_Index]);
        }

        System.out.print(result +N);
    }
}
//已完成 生成验证码