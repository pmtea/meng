/*
    数组是存储多个变量（元素）的东西（容器）
    这多个变量的数据类型要一致

    即可以存储数据类型，也可以存储引用类型
    格式1：数据类型[]数组名；以后都使用第一种
    格式2：数据类型 数组名[];

    栈内存的两个引用指向同一个堆内存地址空间
    无论谁操作，都是针对同一个堆内存
 */

package Shuzu;

public class ShuzuDemo01 {
    public static void main(String[] args){
        int[] arr=new int[3];
      //如何对数组进行初始化
        // 为数组开辟内存空间，并为每个数组赋予值
//            a:动态初始化，只指定长度，由系统给出初始化值
//            B:  给出值，由系统给出长度
    /*
        左边：int说明数组的数据类型
        []说明这是一个数组
        arr是数组名词
        右边：
            new：为数组分配内存空间
            int：说明是int类型
     */
        System.out.println(arr);
        //未赋值，只指 长度，输出地址值[I@4554617c
        //地址值无意义，就要数据值
        arr[0]=100;
        arr[2]=20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }


}
