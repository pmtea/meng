package com.meng;


//学生测试；类
public class ClassDemo {
    public static void main(String[] args){

        //创建对象使用类
        //格式 类名 对象名 = new 类名（）
        Xs s = new Xs();

        //输出成员变量值
        System.out.println(s.age+" "+s.name+" "+s.address);
        s.name="林青霞";
        s.age=20;
        s.address="北京";
        System.out.println(s.age+" "+s.name+" "+s.address);
        s.eat();
        s.sleep();
        s.xueXi();

    }


}

//学生类
class Xs{

    String name;
    String address;
    int age;
    public  void xueXi(){

        System.out.println("学生爱学习");
    }

    public void eat(){

        System.out.println("学习饿了，要吃饭");

    }

    public void sleep(){

        System.out.println("学习累了，要睡觉");

    }
}
