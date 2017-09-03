public class FuncationFor {
    public static void main(String[] args){

        showStar(8,9);
    }
    //需求改变，用方法改进

    public static void showStar(int m,int n){
        for(int x=0;x<m;x++) {
            for (int i = 0; i < n; i++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
