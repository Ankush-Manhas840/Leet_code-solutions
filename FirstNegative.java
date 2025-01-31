import java.util.*;

public class FirstNegative {
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int x=0;
            boolean check=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    x=arr[j];
                    check=true;
                    break;
                }
            }
            if(check) list1.add(x);
            else list1.add(0);
        }
        return list1;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, -1, -7, 8, -15, 30, 16, 28};
        int k1 = 3;
        System.out.println(FirstNegativeInteger(arr1, k1));

        int[] arr2 = {-5, -10, 4, 6, -2, 7, -8};
        int k2 = 2;
        System.out.println(FirstNegativeInteger(arr2, k2));

        int[] arr3 = {1, 2, 3, 4, 5};
        int k3 = 3;
        System.out.println(FirstNegativeInteger(arr3, k3));

        int[] arr4 = {-3, -2, -1, 0, 1, 2, 3};
        int k4 = 4;
        System.out.println(FirstNegativeInteger(arr4, k4));
    }
}
