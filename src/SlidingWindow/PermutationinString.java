package SlidingWindow;

public class PermutationinString {
    public static boolean checkInclusion(String s1,String s2){
        if(s1.length()>s2.length()){
            return false;
        }
        int s1freq[]=new int[26];
        int s2freq[]=new int[26];

        for(int i=0; i<s1.length(); i++){
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
        }
        if(matches(s1freq,s2freq)){
            return true;
        }
        for(int i=s1.length();i<s2.length();i++){
            s2freq[s2.charAt(i)-'a']++;
            s2freq[s2.charAt(i-s1.length())-'a']--;
             if(matches(s1freq,s2freq)){
            return true;
            }
        }
        return false;
    }
        public static boolean matches(int[] a,int[] b){
            for(int i=0; i<26;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
    
    public static void main(String[] args) {
        String s1="ab";
        String s2="sdfbagh";
         System.out.println(checkInclusion(s1, s2));
    }
    
}
