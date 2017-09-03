//数组的遍历
package Shuzu;

public class ArryShow {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2={2,3,1,3};
//    int max = arr.length;
//     for(int i=0;i<max;i++){
//
//            System.out.println(arr[i]);
//     }
//    }
        printArry(arr);
        System.out.println("***************");
        printArry(arr2);

    }

    public static void printArry(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]);
            }else {

                System.out.print(arr[i]+", ");
            }
        }

    }
}

