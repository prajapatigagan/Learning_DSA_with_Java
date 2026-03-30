package BINARY_SEARCH;

public class CountOccurrencee {
    public static int FirstOccurrence(int numbers[], int key){
        int low=0;
        int high=numbers.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numbers[mid]==key){
                first=mid;
                high=mid-1;
            }
            else if(numbers[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return first;
    }

     public static int LastOccurrence(int numbers[], int key){
        int low=0;
        int high=numbers.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numbers[mid]==key){
                first=mid;
                low=mid+1;
            }
            else if(numbers[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       return first;
    }
    public static int countOccurrences(int[] numbers, int key) {

        int first = FirstOccurrence(numbers, key);
        int last = LastOccurrence(numbers, key);

        if (first == -1) {
            return 0;
        } 
        return last - first + 1;
    }

    public static void main(String[] args) {
        int numbers[]={2,3,4,5,5,5,5,5,5,5,5,5,5,5,6,7,8,9};
        int key=5;
        int count = countOccurrences(numbers, key);
        System.out.println("Number of occurrences of " + key + " is: " + count);
    }
}