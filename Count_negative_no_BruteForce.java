public class Count_negative_no_BruteForce {

        public int countNegatives(int[][] grid) {
            int numb=0;
            int row=grid.length;
            int col=grid[0].length;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j]<0){
                        numb++;
                    }
                }
            }
            return numb;
        }
    //This is just a brute force approach ,simple to understand
}
