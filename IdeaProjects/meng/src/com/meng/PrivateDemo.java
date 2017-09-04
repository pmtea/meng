
/*
    private
        是一个权限修饰符
        可以修饰成员变量和成员方法
        被修饰的成员只能在本类中访问
 */
package com.meng;

class Demo{

    private  int num=10;  //private成员变量

    public void show(){   //public方法

        System.out.println(num);
        methd();
    }

    private void methd(){

        System.out.println("aaaa");
    }
}
public class PrivateDemo {
    public static void main(String[] args) {

        Demo d =new Demo();
        d.show();
//        d.methd();
    }
    }

