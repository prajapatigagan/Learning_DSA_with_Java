package BINARY_SEARCH;

public class ReverseAnArray {
    public static void reverse(int arr[]){
        int start=0;
        int last=arr.length-1;
        while(start<last){
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        reverse(arr);
        System.out.print("Reversed array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
