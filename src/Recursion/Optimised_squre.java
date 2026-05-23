package Recursion;

public class Optimised_squre {
    public static int sqr(int a,int n){
        if(n==0){
            return 1;
        }
        int halfsqr=sqr(a,n/2)*sqr(a,n/2);
        if(n%2!=0){
            halfsqr=a*halfsqr; 
        }
        return halfsqr;
    }
    public static void main(String[] args) {
        System.out.println(sqr(2,14));
    }
    
}
