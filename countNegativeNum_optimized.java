public class countNegativeNum_optimized {
    public int countNegatives(int[][] grid) {

        int rows=grid.length;

        int num=0;
        for(int i=0;i<rows;i++){
            int[]arr=grid[i];
            int start =0;
            int end=arr.length-1;

            while(start<=end){
                //the fastt exiting is actually good and it worked for something around 11 test cases
                //but for overall logic the uncommented is prefered




                //fast exiting
                //     if(arr[start]<0){
                //     num+=arr.length-start;

                //     break;
                // }
                // if(arr[end]>0){
                //     break;
                // }
                //fast exiting


                
                int mid=(start+end)/2;
                if(arr[mid]<0){
                    num+=(end-mid+1);

                    end=mid-1;
                }
                else{
                    start=mid+1;
                }




            }
        }
        return num;

    }
}
