package Sorting;

public class Countingsort {
    public static void AscendingOrder(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }  
    }
    public static void DecendingOrder(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1; i>=0; i--){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }  
    }
    public static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
  
    public static void main(String[] args) {
        int arr[]={7,5,1,3,9,4,2,1,5,3};
        AscendingOrder(arr);
        printarr(arr);
        System.out.println();
        DecendingOrder(arr);
        printarr(arr);
    }
}
