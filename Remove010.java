import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Remove010 {


    class Result {

        /*
         * Complete the 'beautifulBinaryString' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING b as parameter.
         */

        public static int beautifulBinaryString(String b) {
            // Write your code here
            StringBuilder a=new StringBuilder(b);
            int changes =0;
            for(int i=1;i<a.length();i++){
                if(i==a.length()-1) break;
                int j=i-1;
                int k=i+1;
                if(a.charAt(j)=='0'&& a.charAt(i)=='1' && a.charAt(k)=='0'){
                    changes++;
                    a.setCharAt(k,'1');
                }
            }
            return changes;

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String b = bufferedReader.readLine();

            int result = Result.beautifulBinaryString(b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
