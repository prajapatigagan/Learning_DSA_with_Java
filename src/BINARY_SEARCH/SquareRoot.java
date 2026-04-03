package BINARY_SEARCH;

public class SquareRoot {
    public static int Square(int n){
        int start=0; int end=n;
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;

            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<n){
                ans=mid;
                start=mid+1;
            } else {
                end=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=8;
        int ans=Square(n);
        System.out.println("Square root of "+n+" is: "+ans);
    }
}
