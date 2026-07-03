package TwoPointer;

public class minimumLengthString {
    public static int minlength(String s){
        int n=s.length();
        int i=0; 
        int j=n-1;
       
        while(i<j&&s.charAt(i)==s.charAt(i)){
            char ch=s.charAt(i);
            while(i<=j&&s.charAt(i)==ch){
                i++;
            }
            while(i<=j&&s.charAt(j)==ch){
                j--;
            }
        }
        return j-i+1;
    } 
    public static void main(String[] args) {
        String s="ca";
        System.out.println(minlength(s));
    }
    
}
