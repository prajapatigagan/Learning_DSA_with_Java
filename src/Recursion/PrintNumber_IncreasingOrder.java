package Recursion;

public class PrintNumber_IncreasingOrder {
    public static void number(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        number(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        number(n);
    }
}
