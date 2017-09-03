package Shuzu;
import java.util.Scanner;
public class PrintTriger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int a = sc.nextInt();

        int[][] arr =new int[a][a];

        //给这个数组的任何一行的第一列赋值为1

        for(a=0;a<arr.length;a++){
            arr[a][0]=1;
            arr[a][a]=1;

        }

        //第1列有值了 最后一列也有值了，行从2开始，列从第二列到倒数第二列
       for(a=2;a<arr.length;a++){
            for(int b=1;b<=a-1;b++){
                arr[a][b]=arr[a-1][b-1]+arr[a-1][b];

            }
        }

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(arr[x][y]+" ");

            }
            System.out.println();
        }

    }
}

/*
    杨辉三角形
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 15 5 1

    A
    B 从第三行开始，每一个数据都是它 上一行的前一列和它上一行的本咧的＆
 */