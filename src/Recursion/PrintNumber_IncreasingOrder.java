package Recursion;

public class PrintNumber_IncreasingOrder {
    public static void number(int n){
        if(n==25){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        number(n+1);
    }
    public static void main(String[] args) {
        int n=0;
        number(n);
    }
}
