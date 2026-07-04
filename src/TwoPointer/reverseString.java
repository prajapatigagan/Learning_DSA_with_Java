package TwoPointer;

public class reverseString {
    public static void reversestring(char[] s){
        int n=s.length;
        int i=0;
        int j=n-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reversestring(s);
        for(int i=0; i<s.length;i++){
            System.out.print((s[i]));
        }

        

    }
    
}
