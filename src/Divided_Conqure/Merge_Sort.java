package Divided_Conqure;
import java.util.Arrays;

public class Merge_Sort {
    public static void merge(int arr[],int start,int end ,int mid){
        int temp[]=new int[end - start + 1];
        int i=start;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=end) { 
            if(arr[i]<=arr[j]){
            temp[k] = arr[i];
                i++;
            }
            else
            {
            temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
             temp[k] = arr[i];
                i++;
        }
        while(j<=end){
             temp[k] = arr[j];
                j++;
        }
        
        for (int idx = 0; idx < temp.length; idx++) {
            arr[idx+start]=temp[idx];
            
        }

    }
    public static void merge_sort(int arr[],int start,int end){
       if(start<end)
        {
         int mid=start+(end-start)/2;
        merge_sort(arr, start,mid);
        merge_sort(arr, mid+1, end);
        merge(arr, start, end, mid);
       }
    }
    public static void main(String[] args) {
        int arr[]={6,2,7,3,8,2,5,9};
        merge_sort(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
}
