public class Valid_Anagram {
    //runtime 25 ms
    //sure i will try to optimize it with the help of Hashmaps
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        StringBuilder b=new StringBuilder(t);
        int length=b.length();
        for(int i=0;i<s.length();i++){
            boolean check=false;
            for(int j=0;j<b.length();j++){
                if(s.charAt(i)==b.charAt(j)){
                    check=true;
                    b.deleteCharAt(j);
                    break;
                }

            }
            if(check==false)
                return false;
        }
        return true;

    }
}
