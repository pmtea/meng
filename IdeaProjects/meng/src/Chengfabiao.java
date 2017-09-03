import java.util.Scanner;

public class Chengfabiao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入值");
        int n =sc.nextInt();
//        int n =9;
        printNN(n);

    }
    /*

        需求：
        两个 明确：void
        参数int

     */
     public static void printNN(int n){

         for(int x=1;x<=n;x++){
             for(int y =1 ;y<=x;y++){
                 System.out.print(y+"*"+x+"="+y*x+'\t');

             }System.out.println();

         }
     }
}
