package Shuzu;

public class ArryStatic {
    public static void main(String[] args) {


//    int[] arr = new int[]{1, 2, 3};
        int[] arr={89,22,11};
    System.out.println(arr);
    System.out.println(arr[1]);

}
}

/*
  注意事项：
    不要同时动态和静态进行
    如下所示
        int[] arr=new int[3]{1,2,3}; //错误
        两个错误
            索引越界 ArryOutBounld
            NullPointException 空指针异常索引为空，无法访问
 */