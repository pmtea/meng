package com.meng;

//给对象数据进行初始化
//构造方法
/*
    如果我们没有给出构造方法，系统将自动提供一个
    如果我们给出了构造方法，系统将不再提供默认的无参构造方法
        这个时候，如果我们还想使用无参，建议永远自己给
 */
class ConstructDemo{
private String name;
    public static void main(String[] args){

        ConstructDemo2 c2=new ConstructDemo2();
        System.out.println(c2);
        c2.Constudent();
    }

    //构造方法的重载
    public void Student94(String name){
        this.name=name;
    }
}
 class ConstructDemo2 {

    private String name;
    private int age;
    public void Constudent(){

        System.out.println("一直在用");
    }


}
