package Practice_self;
import java.util.*;
public class Binary_earch {
    static int bin(int [] arr,int target){
        Arrays.sort(arr);
        int start,end,mid;
        start=0;
        end=arr.length-1;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }  if (arr[mid]>target) {

                end=mid-1;

            }
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return -1;
    }

    static void rec_bin(int []arr,int target,int start,int end){
        Arrays.sort(arr);
        int mid=(start+end)/2;
        if(start>end){
            System.out.println("NOT PRESENT");
            return;
        }
        if(arr[mid]==target){
            System.out.println("present" +mid);
            return;
        }
        if(arr[mid]>target){
            end=mid-1;

        }
        else{
            start=mid+1;
        }
        rec_bin(arr,target,start,end);

    }

    public static void main(String[] args) {
        int []arr={1,323,11,23,454,2323,34354,232,1111111,44,3,22,4};

        rec_bin(arr,232,0,arr.length-1);
    }
}
