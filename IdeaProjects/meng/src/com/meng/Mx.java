/*
    面向过程：一整個过程
    买电脑为例子：
        了解电脑-需求-找对应参数-去中关村-讨价还价-买回电脑
        面向对象：我知道我要买电脑-别人给我买-买回来了

    洗衣服
        面向过程：脱衣服-换新衣服-放进盆里-放洗衣粉-洗衣服-晒衣服
        面向对象：需求-洗衣机-晒衣服
    吃饭：
        面向过程：去超市买菜-摘菜-洗菜-切菜-炒菜-盛菜-吃
        面向对象：下馆子-点菜-厨师-服务员-吃饭-交钱

    家常事物：找个对象，不好好学习，找不到对象。

    万事万物皆对象！

    把大象装进冰箱：
        面向过程：
            动作：
                A：打开冰箱门
                B：装进大象
                C：关闭冰箱门
         代码体现：
            class Demo{
                public static void main(String[] args){
                    System.out.println("");
                    //仅仅为了演示写的输出语句，实际需要很多操作
                    //这个时候代码就比较多一些了
                    //假设我要多次打开冰箱门，每次都写一遍，非常的麻烦
                    //用方法改进
                    open();
                    //调用方法
                }
                public static void open(){

                }

            }
       面向对象：
            A：有哪些类？
                UML统一建模语言
                    名词提取法
            B: 每个类有哪些东西？
            C：类与类之间的关系是什么？
        代码：
            class Elephant{
            public static void main(){

            }
            class 大象{
                public static void open(){

                }
            }
            }

        面向对象的特征：
            面向对象的开发：
                创建对象
                使用对象
                指挥对象做事情
            面向对象设计：
                管理和维护对象之间的关系

        学习编程语言，是为了模拟现实世界的事物，实现信息化；
        如何表现现实世界？
        属性：
            男
            身高
        行为：
            上学
            吃饭
        举例：
 */


package com.meng;

public class Mx{

    public static void main(String[] args){

    }
}
//学生类
 class Student11 {

    String name;
    int age;
    String address;

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

//手机类
//    属性：品牌、颜色、价格
//    行为：打电话、发短信、看电影

class Phone1{

    String brand;
    String color;
    String price;

    public void call(String name){
        System.out.println("给"+name+"打电话");

    }
    public void sms(){
        System.out.println("群发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }

}