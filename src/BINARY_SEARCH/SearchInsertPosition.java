package BINARY_SEARCH;

public class SearchInsertPosition {
    public static int SearchInsert(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
            int arr[]={1,3,5,6};
            int target=4;
            int ans=SearchInsert(arr,target);
            System.out.println("Target is at index: "+ans);
    }
    
}
