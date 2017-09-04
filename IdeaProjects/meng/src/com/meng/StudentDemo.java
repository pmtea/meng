/*
   在成员变量为知可以判断吗？
   无法判断，因为做数据校验
   写方法   返回值void 参数列表 int a
    封装思想
       私有化参数
       隐藏对象的属性和实现细节，仅对外提供公共访问方式。
       好处：
           隐藏实现细节，提供公共的访问方式
           提高了代码的复用性
           提高安全性
       封装原则：
           将不需要对外提供的内容都隐藏起来
           把属性隐藏，提供公共方法对其访问
        */
package com.meng;

class Student22{

    String name;
    private int age;

   public void setAge(int a){

        if (a<0||a>120){
            System.out.println("你的年龄有误");
        }else{
            age=a;
        }
    }
    public void show(){

        System.out.println("姓名： "+name);
        System.out.println("年龄： "+age);
    }
}
 class StudentDemo {
    public static void main(String[] args){
        Student22 ss=new Student22();
        ss.show();
        ss.setAge(20);
        ss.name="雷哥";
        ss.show();
        ss.setAge(-27);
        ss.show();

        //ss.age=-27;
        //错误，应该 设置限制

    }
}
