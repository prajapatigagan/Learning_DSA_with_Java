public class MinimumElement {
    public static int Minimum(int numbers[]){
        int minimum=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<minimum){
                minimum=numbers[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,3,1,8,9};
        int ans=Minimum(numbers);
        System.out.println("minimum numbers is: "+ans);
    }
}
