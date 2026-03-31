package BINARY_SEARCH;

public class MinimuminRotatedSortedArray {
    public static int rotatedSortedArray(int num[]){
        int low = 0;
        int high = num.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (num[mid] < num[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return num[low];
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int ans=rotatedSortedArray(num);
        System.out.println("Minimum element in the rotated sorted array is: "+ans);
    }
}
