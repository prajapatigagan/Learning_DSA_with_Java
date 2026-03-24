public class MaximumElement {
    public static int Maximum(int numbers[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>maximum){
                maximum=numbers[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,3,1,8,9};
        int ans=Maximum(numbers);
        System.out.println("maximum numbers is: "+ans);
    }
    
}
