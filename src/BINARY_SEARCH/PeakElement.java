package BINARY_SEARCH;

public class PeakElement {
    public static int peakElementt(int numbers[]){
        int low=0;
        int high=numbers.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(numbers[mid]>numbers[mid+1]){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
         return high;
    }
    public static void main(String[] args) {

        int numbers[]={1,3,20,4,1,0};
        int ans=peakElementt(numbers);
        System.out.println("Peak element is: "+ans);
        System.out.println("Peak element is: "+numbers[ans]);
    }
}
