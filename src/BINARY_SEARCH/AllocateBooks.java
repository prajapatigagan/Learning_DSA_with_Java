package BINARY_SEARCH;

public class AllocateBooks {

    public static int allocateBooks(int[] books, int k) {
        int n = books.length;

        if (k > n){
             return -1;
        }

        int low = 0, high = 0;

        for (int pages : books) {
            low = Math.max(low, pages); 
            high += pages;           
        }

        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(books, k, mid)) {
                answer = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return answer;
    }


    public static boolean isValid(int[] books, int k, int maxPages) {
        int students = 1;
        int sum = 0;

        for (int pages : books) {
            if (sum + pages <= maxPages) {
                sum += pages;
            } else {
                students++;
                sum = pages;
            }
        }

        return students <= k;
    }

    public static void main(String[] args) {
        int books[] = {10,20,30,40};
        int k = 2;

        int ans = allocateBooks(books, k);
        System.out.println("Minimum pages: " + ans);
    }
}