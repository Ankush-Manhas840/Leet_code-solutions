package Practice_self;
import java.util.*;
public class Toggling_characters {
    static String toggler(String str){
        String y="";
        int x=str.length();
        for(int i=0;i<x;i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                char q=str.charAt(i);
                int conv=(int)q;
                conv+=32;
                char w=(char)conv;

                y+=String.valueOf(w);
            }
            else{
                char q=str.charAt(i);
                int conv=(int)q;
                conv-=32;
                char w=(char)conv;

                y+=String.valueOf(w);

            }
        }
return y;
    }

    public static void main(String[] args) {
        String a= "PhYsicS";
        System.out.println(a);

        System.out.println( toggler(a));
    }
}
