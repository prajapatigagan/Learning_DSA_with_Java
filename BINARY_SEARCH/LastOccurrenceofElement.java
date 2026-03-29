package BINARY_SEARCH;

public class LastOccurrenceofElement {
    public static void LastOccurrence(int numbers[], int key){
        int low=0;
        int high=numbers.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numbers[mid]==key){
                first=mid;
                high=mid+1;
            }
            else if(numbers[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       if(first==-1)
            System.out.println("Element not found");
        else
            System.out.println("Last occurrence of " + key + " is at index: " + first);
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5,5,5,6,7,8,9};
        int key=5;
        LastOccurrence(numbers,key);
    }
}
