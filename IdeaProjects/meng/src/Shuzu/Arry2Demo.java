/*
    二维数组 就是元素魏一维数组的一个数组

    格式
        数据类型[][]数组名 = new 数据类型[m][n]
        m:表示这个二维数据有多少个一维数组
        n:表示每个一维数组有多少个元素

     注意：
        A:以下格式也可以表示二维数组：
            a:数据类型 数组名[][] = new 数据类型[m][n]
            b:数据类型[]数组名[] = new 数据类型 [m][n]
            都不推荐 只推荐上面的、
        B：注意下面定义的区别
            int x,y;
            int[] x,y[]  x是一维数组，y是二维数组 int[]是前缀
 */

package Shuzu;

public class Arry2Demo {
    public static void main(String[] args){

        int [][] arr=new int[3][2];
                //3个一维数组，每个一维有两个元素
        System.out.println(arr);
        //输出二维数组的第一个元素一维数组的名称

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        //输出元素
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

    }
}
