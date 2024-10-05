package Practice_self;
import java.util.*;
public class N_Queens {
    static boolean SafeSpot(char [][]ChessBoard,int row,int col){
        //Row check
       int n= ChessBoard.length;
       for(int i=0;i<n;i++){
           if(ChessBoard[row][i]=='Q') return false;
       }
       //column check
        for(int j=0;j<n;j++){
            if(ChessBoard[j][col]=='Q') return false;
        }
        //in total 4 diagonal direction check
        //Nort-West direction
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(ChessBoard[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        //South East
        while(i<n && j<n){
            if(ChessBoard[i][j]=='Q') return false;
            i++;
            j++;
        }
        i=row;
        j=col;
        //South West
        while(i<n && j>=0){
            if(ChessBoard[i][j]=='Q') return false;
            i++;
            j--;

        }
        //North East
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(ChessBoard[i][j]=='Q') return false;
            i--;
            j++;

        }

        return true;
    }
    static void display(char  [][]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void queen_place(char [][]ChessBoard,int row){
        //base case
        if(row==ChessBoard.length){

            display(ChessBoard);
            return;
        }
        for(int i=0;i<ChessBoard[0].length;i++){
            if(SafeSpot(ChessBoard,row,i)){
                ChessBoard[row][i]='Q';
                queen_place(ChessBoard,row+1);
                //BackTracking cond
                ChessBoard[row][i]='X';

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=4;
        System.out.println("No of QUEENS:"+n);
        char[][] ChessBoard =new char[n][n];
        for(int i=0;i<ChessBoard.length;i++){
            for(int j=0;j<ChessBoard[0].length;j++){
                ChessBoard[i][j]='X';
            }
        }
        queen_place(ChessBoard,0);

    }
}
