package Sorting;

public class SelectionSort {
    public static void AscendingOrder(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

    }
    public static void DescendingOrder(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int largest=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[largest]<arr[j]){
                    largest=j;
                }
            }
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
        }

    }
    public static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,3,9,4};
        AscendingOrder(arr);
        printarr(arr);
        System.out.println();
        DescendingOrder(arr);
        printarr(arr);
    }
}
