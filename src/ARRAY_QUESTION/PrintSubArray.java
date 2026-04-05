package ARRAY_QUESTION;

public class PrintSubArray {
    public static void subArray(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
 
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                   
                    System.out.print(arr[k]+" "); 
                }
                ts++;
                System.out.println();  
                
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
    }
     public static void totalsubArray(int arr[]){
        int ts=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
 
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                   
                    System.out.print(arr[k]+" "); 
                    ts+=arr[k];
                   
                }
                System.out.println();
               
            }
            System.out.print("Sum:"+ts);
            System.out.println();
        }
        System.out.println("Total sum: " + ts);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        subArray(arr);
        totalsubArray(arr);
    }
}
