package Recursion;

public class power {
    public static int Pow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*Pow(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(Pow(2,14));
    }
    
}
