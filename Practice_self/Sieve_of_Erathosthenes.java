package Practice_self;
import java.util.*;
public class Sieve_of_Erathosthenes {
    static int req_prime(int n){
        int arr[]=new int[100];
        for(int i=2;i<arr.length;i++){
            arr[i]=1;
        }
        for(int i=2;i<arr.length;i++){
            for(int j=i*i;j<arr.length;j++){
                if(j%i==0) arr[j]=0;
            }
        }
        int sum=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){ sum++;
                System.out.println(i);
            }
            if(sum==n) break;
        }

return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(req_prime(n));
    }
}
