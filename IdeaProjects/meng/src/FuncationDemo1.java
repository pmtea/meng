/*
    如下的求和方法，无法见名知意
    针对这种情况，方法的功能相同
    参数列表不同，为了见名知意，JAVA运行起一样的名字\\

    方法重载
        在同一个类中，方法名相同，参数列表不同，与返回值无关
    参数列表不同：
      A:参数个数不同；
      B：参数类型不同；

 */

public class FuncationDemo1 {
    public static void main(String[] args){

        int sum =getSum(6,7,8);
        System.out.println(sum);

    }
    public static  int getSum(int a,int b){

        return a+b;
    }
    public static  int getSum(int a,int b ,int c){
        return a+b+c;
    }
    public static int getSum(int a,int b,int c,int d){

        return a+b+c+d;
    }
}
