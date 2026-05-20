package Recursion;

public class PrintNumber_DecreasingOrder {

    public static void Number(int n){
        if(n==0){
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        Number(n-1);
    }

    public static void main(String[] args) {
        int n=15;
        Number(n);
    }
    
}
