package Shuzu;
import java.util.Scanner;
public class ArryLookUp {

    public static void main(String[] args){
    String[] strarr = {"星期一","星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
    Scanner sc= new Scanner(System.in);
    System.out.println("你想查星期几");
    int a =sc.nextInt();

    System.out.println("你要查找的日期是：" +strarr[a-1]);

    }


}
