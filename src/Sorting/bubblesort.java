package Sorting;

public class bubblesort {
    public static void AscendingOrder(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
     public static void DescendingOrder(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        AscendingOrder(arr);
        System.out.print("Ascending Order:");
        printarr(arr);
        System.out.println();
        DescendingOrder(arr);
        System.out.print("Descending Order:");
        printarr(arr);
    }
}
