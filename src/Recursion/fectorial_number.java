package Recursion;

public class fectorial_number {
    public static int number(int n){
        if(n==0){ 
            return 1;
        }
        // int fect=number(n-1);
        // int fn=n*number(n-1);
        int fn=n*number(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(number(n));
    }
    
}
