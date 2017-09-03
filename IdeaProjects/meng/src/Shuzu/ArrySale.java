package Shuzu;

public class ArrySale {
    public static void main(String[] args){

        int[][]sales={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum=0;
                for(int a=0;a<sales.length;a++){

                    for(int b=0;b<sales[a].length;b++){
                        sum=sum+sales[a][b];

                    }

                }

    System.out.println(sum);
    }
}
