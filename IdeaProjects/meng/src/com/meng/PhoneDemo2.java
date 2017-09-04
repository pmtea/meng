package com.meng;
class phone2{

    private String brand;
    private String color;
    private  int price;

    public String getBrand2() {
        return brand;
    }

    public void setBrand2(String brand){

        this.brand=brand;
    }
    public void setColor2(String color){
        this.color=color;
    }

    public String getColor2() {
        return color;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice2() {
        return price;
    }
}

public class PhoneDemo2 {
    public static void main(String[] args){
        phone2 p2=new phone2();
        System.out.println(p2.getBrand2());
        System.out.println(p2.getColor2());
        System.out.println(p2.getPrice2());

        p2.setBrand2("苹果");
        p2.setColor2("玫瑰金");
        p2.setPrice(5288);
        System.out.println(p2.getBrand2());
        System.out.println(p2.getColor2());
        System.out.println(p2.getPrice2());
    }
    }


