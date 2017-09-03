//Intellijg IDEA  class必须属于Module

import java.util.Scanner;
public class Ifsame {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数字");
            int a = sc.nextInt();
            System.out.println("请输入第二个数字");
            int b = sc.nextInt();
            boolean result = ifSame(a,b);
            if(result==true){
                System.out.println("你输入的两个数字相等");}
            else{
                System.out.println("你输入的两个数字不相等");}
        }


    public static boolean ifSame(int a,int b){
        /*
        if(a==b){

            return true;

        }else {
            return false;
        }
        */
        //三元改进
        //return ((a==b)?true:false);
        //最终版，本来就是真假值

        return a == b;
    }

}
