package Recursion;

public class Sorted_array {

    public static boolean number(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return number(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6};
        System.out.println(number(arr,0));
    }
    
}
