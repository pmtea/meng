package Shuzu;

public class ArryIntervted {
        public static void main(String[] args){
        int[] arr={8,2,3,4,5};
                arrReverse(arr);

                //打印数组
                System.out.print("[");
        for(int i=0;i<arr.length;i++) {

                if(i==arr.length-1)

                {System.out.println(arr[i]+"]");

        }else{
                        System.out.print(arr[i]+",");
                }
        }

        }
        public static void arrReverse(int[] arr){


                for(int i=0;i<(arr.length/2);i++){
                        int temp=arr[i];
                    arr[i]=arr[arr.length-1-i];
                    // 0
                    arr[arr.length-1-i]=temp;
                }

        }
}

/*
        使用for循环
        要注意值的变化
 */