package Recursion;

public class fibonacci {
    public static int number(int n){
        if(n==0||n==1){
            return n;
        }
     
        int fun=number(n-1)+number(n-2);
        return fun;      
    }
    public static void main(String[] args) {
        int n=45;
        System.out.println(number(n));
    }
    
}
