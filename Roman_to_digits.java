import java.util.*;
public class Roman_to_digits {
    //for getting the value of the roman characters
    static int valt(char roman){
        //using switch is better tha if-else here
        switch(roman){
            case 'I': return 1;
            case 'V': return 5;
            case 'X':return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M':return 1000;
            default: return 0;
        }}
        //now the calculating function
        static int solution(String x){
        int sum=0;
        //
            //LOGIC:
      // If the current number is smaller than the successor one the current number will be subtracted
//from the total sum,IF NOT simply add the current number to the sum
            for(int i=0;i<x.length();i++){
                if( i==x.length()-1){
                    sum+=valt(x.charAt(i));
                }
                else if(valt(x.charAt(i))<valt(x.charAt(i+1))){
                    sum-=valt(x.charAt(i));
                }
                else{
                  sum+=  valt(x.charAt(i));
                }
        }
            return sum;
    }

    public static void main(String[] args) {
        System.out.println("Roman numeral 'III' converts to: " + solution("III")); // 3
        System.out.println("Roman numeral 'IV' converts to: " + solution("IV"));   // 4
        System.out.println("Roman numeral 'IX' converts to: " + solution("IX"));   // 9
        System.out.println("Roman numeral 'LVIII' converts to: " + solution("LVIII")); // 58
        System.out.println("Roman numeral 'MCMXCIV' converts to: " + solution("MCMXCIV")); // 1994
    }
}
