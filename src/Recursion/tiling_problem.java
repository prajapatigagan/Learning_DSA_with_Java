package Recursion;

public class tiling_problem {
    public static int tiling_nm(int n){
        if(n==0||n==1){
            return 1;
        }
        int nm1=tiling_nm(n-1);
        int nm2=tiling_nm(n-2);
        int to_word= nm1+nm2;
        return to_word;
    }
    public static void main(String[] args) {
        System.out.println(tiling_nm(3));
        System.out.println(tiling_nm(4));
        System.out.println(tiling_nm(5));
        System.out.println(tiling_nm(6));
    }
    
}
