package Divided_Conqure;

import java.util.Arrays;

public class merge_sorted_arr {
    public static void merge_arr(int arr1[],int m, int arr2[],int n){
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;

        while(i>=0&&j>=0){
            if(arr1[i]>arr2[j]){
                arr1[idx--]=arr1[i--];
            }else{
                arr1[idx--]=arr2[j--];
            }
        }
        while(j>=0){
            arr1[idx--]=arr2[j--];
        }
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={4,5,6};
        merge_arr(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));   
    }
    
}
