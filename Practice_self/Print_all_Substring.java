package Practice_self;
import java.util.*;
public class Print_all_Substring {
    public static void main(String[] args) {
        String ac ="abcd";
        for(int i=0;i<=ac.length();i++){
            for(int j=i+1;j<=ac.length();j++){
                System.out.println(ac.substring(i,j));
            }
            System.out.println();
        }

    }
}
