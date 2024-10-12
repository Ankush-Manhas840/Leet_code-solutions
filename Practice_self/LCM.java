package Practice_self;

public class LCM {
    static int lcm(int x,int y){
        int max=Math.max(x,y);
        int lcm=0;
        while(lcm==0){
            max++;
            if(max%x==0 && max%y==0) lcm=max;
        }
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(lcm(2,3));
        System.out.println(lcm(6,11));
    }
}
