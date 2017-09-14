package api;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int guessnumber = (int) (Math.random()*100) + 1;
    System.out.println(guessnumber);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数");
            int youguess = sc.nextInt();
            if (guessnumber > youguess) {
                System.out.println("你猜小了");//TODO

            }
            else if (guessnumber < youguess) {
                System.out.println("你猜大了");

            } else {

                System.out.println("你猜对了");
                break;
            }
        }

    }


}
