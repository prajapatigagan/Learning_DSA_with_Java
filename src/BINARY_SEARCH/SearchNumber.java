package BINARY_SEARCH;

public class SearchNumber {

    public static int Search(int numbers[], int key){
       int low=0;
       int high=numbers.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numbers[mid]==key){
            return mid;
            }
            else if(numbers[mid]<key){
                low=mid+1;
            }
            else{

                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,6,7,8,9};
        int key=22;
        int ans=Search(numbers,key);
        if(ans!=-1){
            System.out.println("target is at index: "+ans);
        }
        else{
            System.out.println("target is not found in the array");
        }
    }
    
}
