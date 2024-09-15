import java.util.*;
public class FinfTheDifference_hashmap_unoptimized {
    public char findTheDifference(String s, String t) {
        char b=' ';
        HashMap<Character,Integer> ap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            ap.put(c,ap.getOrDefault(c,0)+1);

        }
        for(int j=0;j<s.length();j++){
            if(ap.containsKey(s.charAt(j))){
                int val=  ap.get(s.charAt(j));
                ap.put(s.charAt(j),val-1);
            }
        }

        for(HashMap.Entry<Character,Integer> er:ap.entrySet() ){
            if(er.getValue()==1){
                b=er.getKey();
            }
        }
        return b;
    }
}
