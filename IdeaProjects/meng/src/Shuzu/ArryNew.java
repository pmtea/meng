package Shuzu;
import java.util.Scanner;
public class ArryNew {
    public static void main(String[] args){
        int[] arr ={5,4,3,1,23,4,5,6,3};
        Scanner sc= new Scanner(System.in);
        System.out.println("你要查找哪一个数字？");
        int a =sc.nextInt();
        int i=getNew2(a,arr);
        System.out.println(i);


    }
   public static int getNew(int a, int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == a) {
                return i;
           }

       }
       return -1;
       }

       public static int getNew2(int a,int[] arr){

        int index=-1;

           for (int i = 0; i < arr.length; i++) {
               if (arr[i] == a) {
                   index = i;
                   break;
               }


           }
           return index;
       }


}
//报错，缺少返回语句
//假如我要查找的数据在数组中不存在，就找不到，没有对应的返回
//
