package com.meng;

public class PhoneDemo {

    public static void main(String[] args){

        Phone p= new Phone();
        p.brand="Apple";
        p.color="gold";
        p.price=2232;
        System.out.println(p.brand+" "+p.color+" "+p.price);


        p.call("兔子");
        p.sms();
        p.playGame();

    }
}
//手机类
//    属性：品牌、颜色、价格
//    行为：打电话、发短信、看电影

class Phone{

    String brand;
    String color;
    int price;

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