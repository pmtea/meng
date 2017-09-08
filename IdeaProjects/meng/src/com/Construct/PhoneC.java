package com.Construct;


class Phone{
    private String brand;
    private String color;
    private int price;

    //无参
    public Phone(){}

    //getXxx
    public String getBrand(){

        return brand;
    }

    public void setBrand(String brand){

        this.brand=brand;
    }
    public String getColor(){

        return color;
    }
    public void setColor(String color){

        this.color=color;
    }
    public int getPrice(){
        return price;

    }
    public void setPrice(int price){

        this.price=price;
    }



}
public class PhoneC {
    public static void main(String[] args){

        //创建对象
        Phone p=new Phone();
        p.setBrand("三星");
        p.setPrice(1200);
        p.setColor("black");
        System.out.println(p.getBrand()+"---"+p.getColor()+"---"+p.getPrice());


    }
}
