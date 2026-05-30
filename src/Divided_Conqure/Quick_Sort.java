package Divided_Conqure;

public class Quick_Sort {
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quick_sort(int arr[], int low,int high) {
        if(low<high){
            int pidx=partition(arr, low, high);
            quick_sort(arr, low, pidx-1);//left
            quick_sort(arr, pidx+1, high);//right
        }

    }

    public static void main(String[] args) {
        int arr[]={1,3,2,7,4,5,8,6};
        int n=arr.length;
        quick_sort(arr, 0, n-1);
         System.out.print("sorted arr : ");
        for (int i = 0; i < n; i++){   
           
            System.out.print(arr[i]);  
        }
    }
}
