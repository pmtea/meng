import java.util.Scanner;
public class FuncationFor {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("你想打印多少行星星");
    int m =sc.nextInt();
        System.out.println("你想打印多少列星星");
        int n =sc.nextInt();
    showStar(m,n);

//        showStar(8,9);
    }
    //需求改变，用方法改进

    public static void showStar(int m,int n){
        for(int x=0;x<m;x++) {
            for (int i = 0; i < n; i++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
