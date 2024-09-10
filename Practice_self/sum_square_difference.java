package Practice_self;
import java.util.*;
import java.math.*;
public class sum_square_difference {
    //using int
    static int sum1(int n){
        //n(n+1)/2
        int x=(n*(n+1))/2;
        return x;
    }




    static int sum2(int n,int r){
        int y=r;
        int a=y*((2*n+1))/3;
        return a;

    }
//using big integer so that every test case gets passed
static BigInteger sum3(BigInteger n) {
    // n(n+1)/2
    BigInteger x = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
    return x;
}

    static BigInteger sum4(BigInteger n, BigInteger r) {
        BigInteger y = r;
        BigInteger a = y.multiply(n.multiply(BigInteger.valueOf(2)).add(BigInteger.ONE)).divide(BigInteger.valueOf(3));
        return a;
    }
public static void main(String[] args) {
        //if the input and output lies in the integer ranges
    int n=10;
    int w=sum1( n);
    int ti=sum2(n,w);
    System.out.println((w*w)-ti);
    //if the input or output lies in exceed range of integer
    BigInteger N = new BigInteger("10054");

    BigInteger wa = sum3(N);
    BigInteger tir = sum4(N, wa);
    System.out.println(wa.multiply(wa).subtract(tir));

}
}
