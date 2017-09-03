package Shuzu;

public class Arry2Demo4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        printArry2(arr);
    int[][]arr2={{12,33,88},{22,9},{4}};
    printArry2(arr2);

    }

    public static void printArry2(int[][] arr){

        for (int a = 0; a < arr.length; a++) {
            for (int x = 0; x < arr[a].length; x++) {
                System.out.print(arr[a][x]+" ");

            }
            System.out.println();
        }

    }
}
