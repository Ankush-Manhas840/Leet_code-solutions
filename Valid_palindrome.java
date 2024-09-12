public class Valid_palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                int x=(int)a.charAt(i);
                x=x+32;
                char lower=(char)x;
                b.append(lower);

            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=47 && s.charAt(i)<=57 ){
                b.append(s.charAt(i));
            }


        }
        StringBuilder d=new StringBuilder(b);
        d.reverse();

        String x= d.toString();
        String y=b.toString();
        return x.equals(y);

    }
}
