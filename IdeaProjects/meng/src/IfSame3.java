import java.util.Scanner;
public class IfSame3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("输入第一个数");
        int a =sc.nextInt();


        System.out.println("输入第二个数");
        int b =sc.nextInt();


        System.out.println("输入第三个数");
        int c =sc.nextInt();

        int result =getMax(a,b,c);
        System.out.println(result);

    }

    public static int getMax(int a, int b ,int c){

//        if(a>b){
//            if(a>c){
//
//                return a;
//            }else{
//                return c;
//            }
//
//        }else {
//            if(b>c){
//                return b;
//            }else{
//                return c;
//            }
//
//
//        }
//        if(a>b){
//
//            return (a>c?a:c);
//        }else
//        {
//            return (b>c?b:c);
//        }

//
//        return a>b?(a>c?a:c):(b>c?b:c);
        //不建议 要求阅读形强

        //如果a>b 进入第一个流程：如果a也大于C  return a，否则return c
        //如果a<b 进入第二个流程：如果b也大于C return b,否则return c
        int temp =((a>b)?a:b);
        return temp>c?temp:c;
    }


}


