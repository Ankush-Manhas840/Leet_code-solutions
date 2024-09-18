package Practice_self;
import java.util.*;
public class Addition_of_matrices {
    static int[][] user_input(int[][]arr){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        return arr;
    }
    static void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][]arr=new int[2][2];
        user_input(arr);
        int[][]brr=new int[2][2];
        user_input(brr);
        int [][] sum=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
display(sum);

    }
}
