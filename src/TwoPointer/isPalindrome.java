package TwoPointer;

public class isPalindrome {
    public static boolean  palindrome(String s){
        int n=s.length();
        int i=0; 
        int j=n-1;
        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(i)){
                i++;
            }
            while(i<j&&!Character.isLetterOrDigit(j)){
                j--;
            }
            char left=Character.toLowerCase(s.charAt(i));
            char right=Character.toLowerCase(s.charAt(i));
            if(left!=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="madam";
        System.out.println(palindrome(s));
    }
    
}
