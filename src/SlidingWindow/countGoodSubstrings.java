package SlidingWindow;

public class countGoodSubstrings {
    public static int CGS(String s){
        int count=0;
        for(int i=0; i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1)
                &&s.charAt(i)!=s.charAt(i+2)
                   &&s.charAt(i+1)!=s.charAt(i+2)){
                    count++;
                   }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="aababcabc";
        System.out.println(CGS(s));
    }
}
