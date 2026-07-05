package TwoPointer;

public class IsSubsequence {
    public static boolean isSubsequence(String s,String t){
        int n1=s.length();
        int n2=t.length();
        int i=0;
        int j=0;
        while(i<n1&&j<n2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n1;
    }
    public static void main(String[] args) {
        String s= "abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s, t));       
    }
}
