/*
    数据类型[][]数组名 = new 数据类型[m][]
    未指明列数，动态赋值
 */
package Shuzu;

public class Arry2Demo1 {
    public static void main(String[] agrs){

        int [][] arry =new int [3][];

        System.out.println(arry);
        System.out.println(arry[0]);
        System.out.println(arry[1]);
        System.out.println(arry[2]);

        arry [0] = new int[3];
        arry[1] = new int[10];
        arry[2] =new int[4];


        System.out.println(arry);
        System.out.println(arry[0]);
        System.out.println(arry[1]);
        System.out.println(arry[2]);
        System.out.println(arry[0][0]);
        System.out.println(arry[0][1]);
        System.out.println(arry[0][2]);

        arry[1][0]=200;
        arry[0][1]=100;
        System.out.println(arry[0][1]);
    }
}
