package com.meng;
/*
    匿名对象

 */

class Student{
    public void show(){

        System.out.println("我爱学习");
    }
}

public class NoNameDemo {
    public static void main(String[] args){

        Student s= new Student();

        s.show();
    }
}
