package Recursion;

public class Natural_number {
    public static int number(int n){
        if(n==1){
            return 1;
        }
        int fun=n+number(n-1);
        return fun;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(number(n));
    }
    
}
