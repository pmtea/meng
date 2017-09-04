package com.meng;
//变量使用的就近规则
//变量不要和
//当前类的对象

class Student66{

    private String name;
    private int age;

    public String getName1(){

        return name;
    }
    public void setName2(String name){

        this.name =name ;
    }

    public  int getAge1(){

        return age;
    }
    public  void setAge2(int age){

       this.age=age;
    }
}
public class PrivateSample {
    public static void main(String[] args){

        Student66 s66=new Student66();

//        System.out.println(s66.name);

        System.out.println(s66.getName1()+"  "+s66.getAge1());

        s66.setName2("高圆圆");
        s66.setAge2(21);
        System.out.println(s66.getName1()+"  "+s66.getAge1());
    }
}
