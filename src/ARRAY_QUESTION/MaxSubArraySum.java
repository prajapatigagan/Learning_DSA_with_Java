package ARRAY_QUESTION;

public class MaxSubArraySum {

    //maximum subarray sum...
    public static void MaxsubArray(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start=i;
 
            for(int j=i; j<arr.length; j++){
                int end=j;
                currentSum=0;
                for(int k=start; k<=end; k++){
                   
                    
                    currentSum+=arr[k];
                   
                }
                System.out.println(currentSum);
                if(maxSum<currentSum)
                 {
                    maxSum=currentSum;
                 }
               
            }
        }
        System.out.println("Maximum sum: " + maxSum);
    }

    //minimum sub Array sum....
    public static void minsubArray(int arr[]){
        int currentSum=0;
        int minSum=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int start=i;
 
            for(int j=i; j<arr.length; j++){
                int end=j;
                currentSum=0;
                for(int k=start; k<=end; k++){
                   
                    
                    currentSum+=arr[k];
                   
                }
                System.out.println(currentSum);
                if(minSum>currentSum)
                 {
                    minSum=currentSum;
                 }
               
            }
        }
        System.out.println("Minimum sum: " + minSum);
    }

    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,5};
        MaxsubArray(arr); 
        minsubArray(arr);       
    }
}
