package Shuzu;

public class ArryGetMax {
    public static void main(String[] args){
        int[] arr={43,21,33,78,333,999,44};
        int b = getMax(arr);
        System.out.println(b);
    }

    public static int getMax(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++) {
//            return (arr[i]>arr[i+1])?arr[]:arr[i+1];

            if(arr[i]>temp){
                  temp =arr[i];

                }else{
                ;
            }
        }
        return temp;


    }
}
