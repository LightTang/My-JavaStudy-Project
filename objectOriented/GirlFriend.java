package com.LightTang.objectOriented;

public class GirlFriend {

    private String name;
    private int age;
    double height;
    double weight;

    public void setName(String n){
        //name = n;
        this.name = name;
        //局部变量表示测试类中，调用方法传递过来的数据
        //等号的左边 就表示成员位置的name
    }
    public String getName(){
        return name;
    }
    //===============

    public void setAge(int a){
        if (a >= 18 && a <= 25){
            age = a;
        }else {
            System.out.println("The data is wrong");
        }
    }
    public int getAge(){
        return age;
    }




    public void Calling(){
        System.out.println("call");
    }
    public void Eating(){
        System.out.println("eat");
    }
}

//2024 0124 1058 PM