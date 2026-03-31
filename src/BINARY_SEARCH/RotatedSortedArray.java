package BINARY_SEARCH;

public class RotatedSortedArray {
    public static int Search(int numbers[],int target){
        int start=0;
        int end=numbers.length-1;

    while(end>=start){
        int mid=(start+end)/2;
        if(numbers[mid]==target){
            return mid;
        }
        if (numbers[start] <= numbers[mid]) {
                if (target >= numbers[start] && target < numbers[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
         else {
                if (target > numbers[mid] && target <= numbers[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
    }
        return 0;
    }
    public static void main(String[] args) {
        int numbers[]={4,5,6,7,0,1,2};
        int target=1;
        int ans=Search(numbers,target);
        System.out.println("target is at index: "+ans);
    }
}
