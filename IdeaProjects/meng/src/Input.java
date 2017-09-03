import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        int max = getMax(a, b);
        System.out.println("您输入最大的数字是:" + max);

    }

    /*
        两个明确：
            返回值类型：int
            参数列表：int a,int b

     */
    public static int getMax(int a, int b) {

    /*    if(a>b){
            return a;
        }else {
            return b;
        }
    }
    */
    //三元改进
    //    int c = ((a > b) ? a : b);
    //    return c;
        return ((a>b)?a:b);
    }
}
