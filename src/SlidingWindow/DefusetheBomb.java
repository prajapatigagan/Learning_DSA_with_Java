package SlidingWindow;

public class DefusetheBomb {
    public static int[] decrypt(int code[],int k){
        int n=code.length;
        int ans[] =new int[n];
        if(k==0){
            return ans;
        }
        for(int i=0; i<n; i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=code[(i+j)%n];
                }
            }else{
                for(int j=1;j<=-k;j++){
                    sum+=code[(i - j + n)%n];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int code[]={2,4,9,3};
        int k=-2;
       int[] result = decrypt(code, k);

        for(int i = 0; i < result.length; i++){
         System.out.print(result[i] + " ");
        }
    }
}
