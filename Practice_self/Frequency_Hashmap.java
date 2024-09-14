package Practice_self;
import java.util.*;
public class Frequency_Hashmap {
    static int Freq(int[]arr){
        int numb=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hp.putIfAbsent(arr[i],1);
            if(hp.containsKey(arr[i])==true){
                int val=hp.get(arr[i]);
                hp.put(arr[i],val+1);
            }
        }
        for(HashMap.Entry<Integer,Integer> ap: hp.entrySet() ){
            if(ap.getValue()>numb){

                numb=ap.getKey();
            }

        }
        return numb;

    }

    public static void main(String[] args) {
        int[]arr={1,2,1,3,1,3,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5};
        int r=Freq(arr);
        System.out.println(r);
    }
}
