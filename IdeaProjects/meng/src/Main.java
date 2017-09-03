public class Main {

    public static void main(String[] args) {

        //如何调用方法，不调用不执行

        //单独调用。不推荐，没有意义
        //输出调用，不够好，因为可能还会需要使用
        //赋值调用，推荐
        int a =50;
        int b=60;
        int c = sum(a,b);

        c=c+1;
        c++;
        System.out.println(c);
        }


    public static int sum(int a,int b){
        int c =a+b;
        return c;
        }



}