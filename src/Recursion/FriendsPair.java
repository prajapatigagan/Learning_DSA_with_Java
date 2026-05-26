package Recursion;

public class FriendsPair {
    public static int pair(int n){
        if(n==1||n==2 )
        {
            return n;
        }
        // int pr1=pair(n-1);
        // int pr2=pair(n-2);
        // int prway=(n-1)*pr2;
        // int totalpair=pr1+prway;
        // return totalpair;
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair(4));
    }
    
}
